package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListActivityAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private List<Data> dataSet;

    public ListActivityAdapter(List<Data> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.getTitle().setText(dataSet.get(position).getTitle());
        holder.getDescription().setText(dataSet.get(position).getDescription());
        holder.getNumber().setText(String.valueOf(dataSet.get(position).getNumber()));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
