package com.vtf.pqp_v13;

public class Filme {

    private final String titulo;
    private final String caminhoPoster;
    private String descricao;
    private String categoria;
    private Object img;

    public Filme(String titulo, String caminhoPoster) {
        this.titulo = titulo;
        this.caminhoPoster = caminhoPoster;

    }

    public String getTitulo() {

        return titulo;
    }
    public  String getCaminhoPoster(){
        return caminhoPoster;
    }

   // public void setTitulo(String titulo) {
     //   this.titulo = titulo;
   // }

   /* public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Object getImg() {
        return img;
    }

    public void setImg(Object img) {
        this.img = img;
    }*/
}
