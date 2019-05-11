package com.nop.basicrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.nop.basicrecyclerview.R;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<String> mItemList;
    Context mContext;

    public RecyclerViewAdapter(Context context, List<String> itemList) {
        mItemList = itemList;
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        final View view = LayoutInflater.from(context).inflate(R.layout.row_recylerview, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {
        /*
         * set values to items
         * */
        String itemText = mItemList.get(position);
        viewHolder.tvUserName.setText(itemText);
        viewHolder.ivProfile.setImageResource(R.drawable.img_avatar);
    }

    public int getBasicItemCount() {
        return mItemList == null ? 0 : mItemList.size();
    }


    @Override
    public int getItemCount() {
        return getBasicItemCount();
    }

    /*
     * Create viewholder
     * */
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivProfile;
        TextView tvUserName;


        public MyViewHolder(View view) {
            super(view);

            tvUserName = view.findViewById(R.id.tvUserName);
            ivProfile = (ImageView) view.findViewById(R.id.ivProfile);

        }
    }
}
