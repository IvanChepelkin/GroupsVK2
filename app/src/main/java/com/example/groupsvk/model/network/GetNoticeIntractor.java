package com.example.groupsvk.model.network;

import com.example.groupsvk.model.models.Item;

import java.util.List;

public interface GetNoticeIntractor {

    void getGroups(OnFinishedListener onFinishedListener, String keyWord);

    interface OnFinishedListener {

        void onFinished(List<Item> groupsList);

        void onFailure(Throwable t);
    }


}
