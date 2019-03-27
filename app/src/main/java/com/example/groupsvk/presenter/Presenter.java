package com.example.groupsvk.presenter;

import com.example.groupsvk.model.models.Item;
import com.example.groupsvk.model.network.GetNoticeIntractor;
import com.example.groupsvk.view.IView;

import java.util.List;

public class Presenter implements GetNoticeIntractor.OnFinishedListener {
    private IView iview;
    private GetNoticeIntractor getNoticeIntractor;

    public Presenter(IView iview, GetNoticeIntractor getNoticeIntractor) {
        this.iview = iview;
        this.getNoticeIntractor = getNoticeIntractor;
    }

    public void loadDataFromServer(String keyWord) {
        getNoticeIntractor.getGroups(this, keyWord);
    }

    @Override
    public void onFinished(List<Item> groupsList) {

    }

    @Override
    public void onFailure(Throwable t) {

    }
}
