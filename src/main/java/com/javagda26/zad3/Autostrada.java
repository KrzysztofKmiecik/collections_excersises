package com.javagda26.zad3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Autostrada {
    //mapa  ktorej przechowyjemy pojazdy
    //dla szybkiego wyszukiwania  kluczem jest nr rej
    private Map<String,InformacjaOPojezdzie> mapaPojazdow= new HashMap<>();

    void wjazdPojazduNaAutostrade(String numerRejestracyjny,TypPojazdu typPojazdu){
       InformacjaOPojezdzie informacjaOPojezdzie=new InformacjaOPojezdzie(numerRejestracyjny,typPojazdu, LocalDateTime.now());
        mapaPojazdow.put(numerRejestracyjny,informacjaOPojezdzie);
        System.out.println("Pojazd: "+informacjaOPojezdzie+" wjechał na autostrade.");
    }

   public InformacjaOPojezdzie znajdzPojazd (String numerRejestracyjny) {
       if (mapaPojazdow.containsKey(numerRejestracyjny)) {
           System.out.println("Pojazd wciaz jest na autostradzie");
           return mapaPojazdow.get(numerRejestracyjny);

       }
       throw new NieMoznaZnalescPojazduExeption("Brak pojazdu");
   }
   public Double wyjazdPojazdu(String numerRejestracyjny){
       if (!mapaPojazdow.containsKey(numerRejestracyjny)) {
           throw new NieMoznaZnalescPojazduExeption("Brak pojazdu");

       }
       InformacjaOPojezdzie informacjaOPojezdzie =mapaPojazdow.get(numerRejestracyjny);

       Duration dlugoscPrzejazdu=Duration.between(informacjaOPojezdzie.getDataWjazdu(),LocalDateTime.now());
       double doZaplaty=0.0;
       switch (informacjaOPojezdzie.getTypPojazdu()){
           case OSOBOWY:
               doZaplaty=dlugoscPrzejazdu.getSeconds()*0.3;
               break;
           case MOTOCYKL:
               doZaplaty=dlugoscPrzejazdu.getSeconds()*0.2;
               break;
           case CIEZAROWY:
               doZaplaty=dlugoscPrzejazdu.getSeconds()*0.5;
               break;

               }
               //
       mapaPojazdow.remove(numerRejestracyjny);
       System.out.println("Pojazd: "+numerRejestracyjny+ "opuszcza autostradę, do zaplaty: "+ doZaplaty);
       return doZaplaty;
       }
   }

