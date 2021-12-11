package com.example.apipractse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.apipractse.Controller.AppController;
import com.example.apipractse.datamodel.MusicSeparationDM;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    AppController appController;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.fileNamesTxt);
        appController =(AppController) getApplicationContext();

        appController.apiServices.CallApi(new Callback<MusicSeparationDM>() {
            @Override
            public void success(MusicSeparationDM musicSeparationDM, Response response) {
                txt.setText(musicSeparationDM.getFiles().get(0).getFile());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("Error",error.toString());
            }
        });

    }
}