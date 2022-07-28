package com.upchiapas.posters.models;

public class Postrers {
    private static byte folio; private static String postrers, ingrediente;
    public Postrers(byte folio, String postrers, String ingrediente){
        Postrers.folio=folio;
        Postrers.postrers=postrers;
        Postrers.ingrediente=ingrediente;
    }
    public byte getfolio(){return folio;}
    public String getPostrers(){return postrers;}
    public String getIngrediente(){return ingrediente;}
}
