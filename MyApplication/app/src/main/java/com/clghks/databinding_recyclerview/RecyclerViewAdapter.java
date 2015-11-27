package com.clghks.databinding_recyclerview;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by chihwan on 15. 11. 27..
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.BindingHolder>{
    private List<User> userList;

    public RecyclerViewAdapter(List<User> userList){
        this.userList = userList;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_user, parent, false);
        BindingHolder holder = new BindingHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        holder.getViewDataBinding().setVariable(com.clghks.databinding_recyclerview.BR.user, userList.get(position));
        holder.getViewDataBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class BindingHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding viewDataBinding;

        public BindingHolder(View itemView) {
            super(itemView);
            viewDataBinding = DataBindingUtil.bind(itemView);
        }

        public ViewDataBinding getViewDataBinding() {
            return viewDataBinding;
        }
    }
}
