package com.upchiapas.posters.models;

public class Postres {
    private int folio; static String postres, ingrediente;
    public Postres(String postres, String ingrediente, int folio){
        this.folio=folio;
        this.postres=postres;
        this.ingrediente=ingrediente;
    }
    public int getfolio(){return folio;}
    public String getPostres(){return postres;}
    public String getIngrediente(){return ingrediente;}
}