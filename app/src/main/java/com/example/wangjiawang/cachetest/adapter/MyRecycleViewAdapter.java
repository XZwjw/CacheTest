package com.example.wangjiawang.cachetest.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wangjiawang.cachetest.R;
import com.example.wangjiawang.cachetest.adapter.test.EntityTest;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Description:RecycleView的一个适配器（常用版）
 * Created by wangjiawang on 2018/7/12.
 * complete
 */

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.MyViewHolder> {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<EntityTest> mList;


    public MyRecycleViewAdapter(Context context, List<EntityTest> list) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
        mList = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.module_recycle_item_entity_test, parent, false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        EntityTest test = mList.get(position);
        holder.mId.setText(test.getId());
        holder.mName.setText(test.getName());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.module_recycle_item_id)
        TextView mId;
        @BindView(R.id.module_recycle_item_name)
        TextView mName;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);
        }
    }
}
