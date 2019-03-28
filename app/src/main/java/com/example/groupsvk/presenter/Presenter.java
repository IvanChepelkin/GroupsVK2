package com.example.groupsvk.presenter;

import com.example.groupsvk.model.models.Item;
import com.example.groupsvk.model.network.GetNoticeIntractor;
import com.example.groupsvk.view.IView;

import java.util.List;

public class Presenter implements GetNoticeIntractor.OnFinishedListener {
    private IView view;
    private GetNoticeIntractor getNoticeIntractor;

    public Presenter(IView iview, GetNoticeIntractor getNoticeIntractor) {
        this.view = iview;
        this.getNoticeIntractor = getNoticeIntractor;
    }

    public void loadDataFromServer(String keyWord) {
        getNoticeIntractor.loadGroups(this, keyWord);
    }

    @Override
    public void onFinished(List<Item> groupsList) {
        view.setGroupsForView(groupsList);
    }

    @Override
    public void onFailure(Throwable t) {

    }
}
