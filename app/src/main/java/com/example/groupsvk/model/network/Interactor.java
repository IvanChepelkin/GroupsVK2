package com.example.groupsvk.model.network;

import com.example.groupsvk.model.models.GroupsModelApi;
import com.example.groupsvk.model.models.Item;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Interactor implements GetNoticeIntractor {

    private EndPoints endPointsApi;

    @Override
    public void loadGroups(final OnFinishedListener onFinishedListener, String keyWord) {
        endPointsApi = GroupsService.getInstance().getApi();

        final Call<GroupsModelApi> groupsModel = endPointsApi.getGroups(keyWord);
        groupsModel.enqueue(new Callback<GroupsModelApi>() {

            @SuppressWarnings("NullableProblems")
            @Override
            public void onResponse(Call<GroupsModelApi> call, Response<GroupsModelApi> response) {

                GroupsModelApi groupsModelApi = response.body();
                if (groupsModelApi != null && groupsModelApi.getResponse() != null) {
                    List<Item> listGroups = groupsModelApi.getResponse().getItems();
                    onFinishedListener.onFinished(listGroups);
                }
            }

            @SuppressWarnings("NullableProblems")
            @Override
            public void onFailure(Call<GroupsModelApi> call, Throwable t) {
                onFinishedListener.onFailure(t);
            }
        });
    }
}
