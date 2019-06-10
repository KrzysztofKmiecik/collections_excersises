package com.javagda26.mojoptional;

import java.util.Optional;

public class Main {
    static String[] jezyki ;
    static int ilosc = 0;

    public static void dodajJezyk() {
        if (ilosc == 0) {
            jezyki = new String[10];
        }

        return;
    }

    public static void main(String[] args) {
        System.out.println(jezyki[0]);// to wywola nullpoinerexeption

        Optional.ofNullable(jezyki)//to  nie wywola nullpointerexeption
                .ifPresent(j -> {
                    System.out.println(j[0]);
                });
        /*if(!Optional.ofNullable(jezyki)
                .isPresent())
        {
            System.out.println("puste");
        }*/
      /*  if (jezyki != null) {

        } else {
            System.out.println("lista jest pusta");
        }*/
    }
}
