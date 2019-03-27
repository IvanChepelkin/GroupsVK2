package com.example.groupsvk.model.network;

import com.example.groupsvk.model.models.GroupsModelApi;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EndPoints {
    @GET("groups.search?count=100&access_token=313969095b462af7cf71f434aeff9d5d92a173baacc3172761793061a647905bc74212646a69cfa5f0901&v=5.92")
    Call<GroupsModelApi> getGroups(@Query("q") String keyWord);
}
