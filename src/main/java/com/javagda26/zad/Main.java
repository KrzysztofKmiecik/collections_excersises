package com.javagda26.zad;

public class Main {
    public static void main(String[] args) {
        RejestrObywateli rejestrObywateli = new RejestrObywateli();
        rejestrObywateli.dodajObywatela("75031500692", "Krzysztof", "Kmiecik");
        rejestrObywateli.dodajObywatela("79031500692", "Rafał", "Kmiecik");
        rejestrObywateli.dodajObywatela("69031500692", "Ola", "ecik");
        System.out.println(rejestrObywateli.znajdzObywateliUrodonychPrzed(1977));
        System.out.println(rejestrObywateli.znajdzObywatelaPoNazwisku("Kmiecik"));
        System.out.println(rejestrObywateli.znajdzObywatelaPoPeselu("79031500692"));
        System.out.println(rejestrObywateli.znajdzObywateliZRokuZImieniem(1969,"Ola"));
    }
}
