package com.example.groupsvk.presenter;

import com.example.groupsvk.model.network.ApiHelper;
import com.example.groupsvk.model.network.IApiHelper;
import com.example.groupsvk.view.IView;

public class Presenter {
    private IView iview;
    private ApiHelper apiHelper;

    public Presenter(IView iview) {
        this.iview = iview;
        this.apiHelper = new ApiHelper();
    }

    public void loadDataFromServer() {
        apiHelper.getGroups("Музыка");

    }
}
