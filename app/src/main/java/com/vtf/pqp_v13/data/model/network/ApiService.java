package com.vtf.pqp_v13.data.model.network;

import android.app.Activity;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.Moshi.Builder;
import com.vtf.pqp_v13.data.model.FilmesService;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;


public class ApiService{

    private static FilmesService INSTANCE;

    public static FilmesService getInstance(){
        if (INSTANCE == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/").addConverterFactory(MoshiConverterFactory.create()).build();
            INSTANCE = retrofit.create(FilmesService.class);
        }
        return INSTANCE;
    }

}
