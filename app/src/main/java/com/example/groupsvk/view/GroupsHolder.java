package com.example.groupsvk.view;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.groupsvk.R;
import com.example.groupsvk.model.models.Item;

class GroupsHolder extends RecyclerView.ViewHolder {
    private Item modelGroup;
    private View root;
    private TextView nameGroup;
    private TextView number_of_subscribers;
    private ImageView iconGroup;

    private GroupsHolder(@NonNull View itemView) {
        super(itemView);
        root = itemView;
        nameGroup = itemView.findViewById(R.id.name_group);
        number_of_subscribers = itemView.findViewById(R.id.number_of_subscribers);
        iconGroup = itemView.findViewById(R.id.icon_group);
    }

    void bind(Item modelGroup) {
        this.modelGroup = modelGroup;
        nameGroup.setText(modelGroup.getName());
        number_of_subscribers.setText(modelGroup.getType());
      //  iconGroup.setImageURI();

    }

    static GroupsHolder create(LayoutInflater inflater, ViewGroup parent) {
        return new GroupsHolder(inflater.inflate(R.layout.item_group, parent, false));
    }
}
