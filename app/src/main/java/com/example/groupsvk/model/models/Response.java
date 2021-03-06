package com.example.groupsvk.model.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Response {

    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}