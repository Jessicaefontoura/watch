package com.vtf.pqp_v13.data.model.network.response;

public class FilmeResponse {

    @Json(name = "poster_path")
    private final String caminhoPoster;

    @Json(name = "original_title")
    private final String tituloOriginal;

    public FilmeResponse(String caminhoPoster, String tituloOriginal){
        this.caminhoPoster = caminhoPoster;
        this.tituloOriginal = tituloOriginal;
    }

    public String getCaminhoPoster(){
        return caminhoPoster;
    }

    public String getTituloOriginal(){
        return tituloOriginal;
    }

}
