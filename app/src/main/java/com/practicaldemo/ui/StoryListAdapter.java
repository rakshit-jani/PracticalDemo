package com.practicaldemo.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.practicaldemo.R;
import com.practicaldemo.model.HitsBean;
import com.practicaldemo.model.SearchByDateModel;
import com.practicaldemo.paging.SearchByDayPaging;

import java.util.ArrayList;
import java.util.List;

public class StoryListAdapter extends
        RecyclerView.Adapter<StoryListAdapter.ViewHolder> {

    private Context context;
    private List<HitsBean> list;
    private SearchByDayPaging ref;

    public StoryListAdapter(SearchByDayPaging ref,Context context) {
        this.context = context;
        this.ref = ref;
        this.list = new ArrayList<>();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView list_item_title;
        Switch story_list_switch;

        public ViewHolder(View itemView) {
            super(itemView);
            list_item_title = itemView.findViewById(R.id.list_item_title);
            story_list_switch = itemView.findViewById(R.id.story_list_switch);
        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.item_stories_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HitsBean item = list.get(position);

        holder.list_item_title.setText(item.getTitle());

        holder.story_list_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ref.changeConter(isChecked);
            }
        });
    }

    public void updateList(List<HitsBean> list) {
        if (list != null && this.list != null) {
            this.list.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void addList(List<HitsBean> list) {
        if (list != null ) {
            if (this.list != null) {
                this.list.clear();
            }else {
                this.list = new ArrayList<>();
            }
            this.list.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}