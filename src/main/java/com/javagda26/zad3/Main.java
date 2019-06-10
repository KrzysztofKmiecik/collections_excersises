package com.javagda26.zad3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Autostrada autostrada=new Autostrada();
        String komenda;
        do{
            System.out.println("Podaj komende");
            komenda=scanner.nextLine();
            String[] slowa=komenda.split(" ");
            if (slowa[0].equalsIgnoreCase("wjazd")){
                if(slowa.length>=3){
                    String nRej=slowa[1];
                    String slowotypPojazdu=slowa[2];
                    try{
                        TypPojazdu typ=TypPojazdu.valueOf((slowotypPojazdu.toUpperCase()));
                   autostrada.wjazdPojazduNaAutostrade(nRej,typ);
                    }catch (IllegalArgumentException iae){
                        System.err.println("Blad zly typ pojazdu");
                    }

                }

            }else if (slowa[0].equalsIgnoreCase("wyjazd")){
                if(slowa.length>=2){
                    String nRej=slowa[1];
                    System.out.println(autostrada.wyjazdPojazdu(nRej));
                }

            }else if (slowa[0].equalsIgnoreCase("sprawdz")){
                if(slowa.length>=2){
                    String nRej=slowa[1];
                    System.out.println(autostrada.znajdzPojazd(nRej));
                }
            }
        }while (!komenda.equalsIgnoreCase("zamknij"));
    }



}
