package com.javagda26.zad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RejestrObywateli implements IRejestrObywateli {
    Map<String, Obywatel> obywatelMap = new HashMap<>();

    @Override
    public void dodajObywatela(String pesel, String imie, String nazwisko) {
        obywatelMap.put(pesel, new Obywatel(pesel, imie, nazwisko));
    }

    @Override
    public List<Obywatel> znajdzObywateliUrodonychPrzed(int rok) {

        List<Obywatel> obywatels = new ArrayList<>();
        for (java.util.Map.Entry para : obywatelMap.entrySet()) {
            String klucz = (String) para.getKey();
            klucz = klucz.substring(0, 2);
            int pesel_rok = Integer.parseInt(klucz);
            pesel_rok += 1900;
            if (pesel_rok < rok) {
                obywatels.add((Obywatel) para.getValue());

            }

        }
        return obywatels;
        //  return Collections.emptyList();
    }


    @Override
    public List<Obywatel> znajdzObywateliZRokuZImieniem(int rok, String imie) {
        List<Obywatel> obywatels = new ArrayList<>();

        for (Obywatel obywatel : obywatelMap.values()) {
            int pesel_rok = Integer.parseInt(obywatel.getPesel().substring(0, 2));
            pesel_rok += 1900;
            if (pesel_rok == rok && obywatel.getImie().equalsIgnoreCase(imie)) {
                obywatels.add(obywatel);
            }
        }

        return obywatels;

        //  return Collections.emptyList();
    }

    @Override
    public List<Obywatel> znajdzObywatelaPoNazwisku(String nazwisko) {
        List<Obywatel> obywatels = new ArrayList<>();
        for (Obywatel obywatel : obywatelMap.values()) {
            if (obywatel.getNazwisko().equalsIgnoreCase(nazwisko)) {
                obywatels.add(obywatel);
            }
        }
        return obywatels;
        // return Collections.emptyList();
    }

    @Override
    public List<Obywatel> znajdzObywatelaPoPeselu(String pesel) {
        List<Obywatel> obywatels = new ArrayList<>();

        for (String klucz : obywatelMap.keySet()) {
            if (pesel.equalsIgnoreCase(klucz)) {
                obywatels.add(obywatelMap.get(klucz));
            }
        }


        return obywatels;

        //return Collections.emptyList();
    }
}
