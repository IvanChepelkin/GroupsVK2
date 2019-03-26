package com.example.groupsvk.model.network;

import com.example.groupsvk.model.models.GroupsModelApi;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiHelper implements IApiHelper {
    private EndPoints endPointsApi;

    @Override
    public void getGroups(String keyWord) {

        endPointsApi = GroupsService.getInstance().getApi();

        Call<GroupsModelApi> groupsModel = endPointsApi.getGroups();
        groupsModel.enqueue(new Callback<GroupsModelApi>() {

            @Override
            public void onResponse(Call<GroupsModelApi> call, Response<GroupsModelApi> response) {
                if (response.isSuccessful()) {
                    System.out.println("response " + response.body());
                } else {
                    System.out.println("response code " + response.code());
                }
            }

            @Override
            public void onFailure(Call<GroupsModelApi> call, Throwable t) {
                try {
                    throw new InterruptedException("Something went wrong!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
