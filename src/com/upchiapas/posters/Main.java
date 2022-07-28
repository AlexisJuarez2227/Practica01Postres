package com.upchiapas.posters;
import com.upchiapas.posters.models.Participantes;
import com.upchiapas.posters.models.Postres;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static Participantes objetoParticipantes; private static Postres objetoPostres;
    private static Participantes []listaParticipantes; private static Postres[]listaPostres;
    private static Scanner entrada=new Scanner(System.in);
    private static String nombre, lugar, ingrediente; private static int cantidadParticipante, folio;
    public static void main(String[] args) {
        System.out.println("Ingresar el numero de participates");
        cantidadParticipante=entrada.nextInt();
        registrarParticipante();
    }
    public static void registrarParticipante(){
        listaParticipantes = new Participantes[cantidadParticipante];
        for (int i=0; i<cantidadParticipante;i++) {
            System.out.println("Ingrese el nombre del participante");
            nombre = entrada.next();
            System.out.println("Ingrese el lugar del participante");
            lugar = entrada.next();
            do {
                folio=(int) (Math.random()*1000);
            }while (folio<0);
            objetoParticipantes=new Participantes(nombre, lugar, folio);
            listaParticipantes[i] = objetoParticipantes;
        }
        registrarPostres();
    }
    public static void registrarPostres(){
        listaPostres=new Postres[cantidadParticipante];
        for (int i=0;i<cantidadParticipante;i++) {
            System.out.println("Ingrese el nombre del postre");
            nombre = entrada.next();
            System.out.println("Ingrese el ingrediente principal");
            ingrediente = entrada.next();
            folio=listaParticipantes[i].getFolio();
            objetoPostres = new Postres(nombre, ingrediente, folio);
            listaPostres[i] = objetoPostres;
        }
        mostrarMenu();
    }
    public static void mostrarMenu(){
        int opcion;
        boolean salida=true;
        do {
            System.out.println("Menu");
            System.out.println("1- Buscar participante por nombre");
            System.out.println("2- Buscar participante por folio");
            System.out.println("3- Buscar postre");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    buscarParticipanteN();
                    salida=true;
                    break;
                case 2:
                    buscarParticipanteF();
                    salida=true;
                    break;
                case 3:
                    buscarPostres();
                    salida=true;
                    break;
                default:
                    System.out.println("Error");
                    salida = false;
                    break;
            }
        } while (salida);
    }
    public static void buscarParticipanteN(){
        System.out.println("Ingrese es nombre del participante");
        nombre=entrada.next();
        for (int i=0; i<cantidadParticipante;i++){
            if (Objects.equals(nombre, listaParticipantes[i].getNombre())){
                System.out.println("El participante es: "+ listaParticipantes[i].getNombre()+" "+listaParticipantes[i].getLugar()+" "+listaParticipantes[i].getFolio());
            }
        }
    }
    public static void buscarParticipanteF(){
        System.out.println("Ingrese el folio del participante");
        folio=entrada.nextInt();
        for (int i=0; i<cantidadParticipante;i++){
            if (Objects.equals(folio, listaParticipantes[i].getFolio())){
                System.out.println("El participante es: "+ listaParticipantes[i].getNombre()+" "+listaParticipantes[i].getLugar()+" "+listaParticipantes[i].getFolio());
            }
        }
    }
    public static void buscarPostres(){
        System.out.println("Ingrese el folio del postre");
        folio=entrada.nextInt();
        for (int i=0; i<cantidadParticipante;i++){
            if (Objects.equals(folio, listaPostres[i].getfolio())){
                System.out.println("El postre es: "+ listaPostres[i].getPostres()+" "+listaPostres[i].getPostres()+" "+listaPostres[i].getfolio());
            }
        }
    }
}
