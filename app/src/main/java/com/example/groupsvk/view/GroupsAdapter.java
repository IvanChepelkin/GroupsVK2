package com.example.groupsvk.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.groupsvk.model.models.Item;

import java.util.List;

public class GroupsAdapter extends RecyclerView.Adapter<GroupsHolder> {
    private List<Item> listGroups;

    public GroupsAdapter(List<Item> listGroups) {
        this.listGroups = listGroups;
    }

    @NonNull
    @Override
    public GroupsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return GroupsHolder.create(LayoutInflater.from(viewGroup.getContext()), viewGroup);
    }

    @Override
    public void onBindViewHolder(@NonNull GroupsHolder groupsHolder, int i) {
        groupsHolder.bind(listGroups.get(i));

    }

    @Override
    public int getItemCount() {
        return listGroups.size();
    }
}
