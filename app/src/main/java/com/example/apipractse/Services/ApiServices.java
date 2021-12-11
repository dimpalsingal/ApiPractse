package com.example.apipractse.Services;

import com.example.apipractse.datamodel.MusicSeparationDM;

import retrofit.Callback;
import retrofit.http.GET;

public interface ApiServices {

    @GET("/api/lastrows/")
    public void CallApi(Callback<MusicSeparationDM> musicSeparationDMCallback);
}
