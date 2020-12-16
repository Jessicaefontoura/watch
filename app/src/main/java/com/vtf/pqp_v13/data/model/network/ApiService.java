package com.vtf.pqp_v13.data.model.network;

import com.vtf.pqp_v13.data.model.FilmesService;

import retrofit2.Retrofit;
import com.squareup.*;



public class ApiService {

    private static FilmesService INSTANCE;

    public static FilmesService getInstance(){
        if (INSTANCE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.themoviedb.org/3/")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build();
            INSTANCE = retrofit.create(FilmesService.class);
        }
        return INSTANCE;
    }

}
