package com.example.groupsvk.model.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GroupsService {
    private static GroupsService mInstance;
    private Retrofit mRetrofit;
    private static final String BASE_URL = "https://api.vk.com/method/";

    private GroupsService() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .addInterceptor(interceptor);

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build();
    }

    public static GroupsService getInstance() {
        if (mInstance == null) {
            mInstance = new GroupsService();
        }
        return mInstance;
    }

    public EndPoints getApi() {
        return mRetrofit.create(EndPoints.class);
    }
}

