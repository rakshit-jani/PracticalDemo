package com.practicaldemo.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.practicaldemo.R;
import com.practicaldemo.api.APICallingInterface;
import com.practicaldemo.api.RetrofitAPIClient;
import com.practicaldemo.paging.SearchByDayPaging;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_view;
    private TextView counter;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMembers();
    }

    private void initMembers() {
        recycler_view = findViewById(R.id.recycler_view);
        counter = findViewById(R.id.switch_counter);

        setupRecyclerView(recycler_view);
    }


    public void setNotifCount(boolean increase){
        if (increase) {
            count += 1;
        }else {
            count -= 1;
        }
        counter.setText(String.valueOf(count));
    }

    private void setupRecyclerView(RecyclerView recycler_view) {
        SearchByDayPaging searchByDayPaging = new SearchByDayPaging(MainActivity.this,recycler_view);
    }
}
