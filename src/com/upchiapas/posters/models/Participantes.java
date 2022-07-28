package com.upchiapas.posters.models;

public class Participantes {
    private String nombre, lugar; private int folio;
    public Participantes(String nombre, String lugar, int folio){
        this.nombre=nombre;
        this.lugar=lugar;
        this.folio=folio;
    }
    public String getNombre(){return nombre;}
    public String getLugar(){return lugar;}
    public int getFolio(){return folio;}
}
