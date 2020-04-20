package com.practicaldemo.paging;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.practicaldemo.api.APICallingInterface;
import com.practicaldemo.api.RetrofitAPIClient;
import com.practicaldemo.model.SearchByDateModel;
import com.practicaldemo.ui.MainActivity;
import com.practicaldemo.ui.StoryListAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchByDayPaging {

    ProgressDialog progressDialog;
    private RecyclerView recyclerView;
    private MainActivity context;
    private int lastPage = 0;
    private StoryListAdapter storyListAdapter;

    public SearchByDayPaging(MainActivity context, RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        this.context = context;
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading...");
        storyListAdapter = new StoryListAdapter(this,context);

        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(storyListAdapter);

        getStories();

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (!recyclerView.canScrollVertically(1)){
                    lastPage+=1;
                    getStories();
                }
            }
        });
    }

    private void getStories() {
        progressDialog.show();
        Log.e("LastPage",""+lastPage);
        RetrofitAPIClient.getRetrofitInstance().create(APICallingInterface.class).getStory("story", String.valueOf(lastPage)).enqueue(new Callback<SearchByDateModel>() {
            @Override
            public void onResponse(Call<SearchByDateModel> call, Response<SearchByDateModel> response) {
                if (response != null && response.isSuccessful() && response.body() != null && response.body().getHits() != null && response.body().getHits().size() > 0) {
                    if (storyListAdapter!=null ){
                        storyListAdapter.updateList(response.body().getHits());
                    }
                }
                progressDialog.dismiss();
            }

             @Override
            public void onFailure(Call<SearchByDateModel> call, Throwable t) {
                 progressDialog.dismiss();
            }
        });
    }

    public void changeConter(boolean value){
        context.setNotifCount(value);
    }



}
