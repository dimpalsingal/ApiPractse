package com.example.apipractse.Controller;

import android.app.Application;

import com.example.apipractse.Services.ApiServices;

import retrofit.RestAdapter;

public class AppController extends Application {


    public ApiServices apiServices;
    private static final String SHOPCH11_SERVER = "https://musicseparation.com";
    RestAdapter restAdapter;
    @Override
    public void onCreate() {
        super.onCreate();
        restAdapter = new RestAdapter.Builder().
                setEndpoint(SHOPCH11_SERVER)
//                .setClient(new MyUrlConnectionClient())
//                .setConverter(new GsonConverter(deserializerGson))
                .build();
        apiServices= restAdapter.create(ApiServices.class);
    }
}
