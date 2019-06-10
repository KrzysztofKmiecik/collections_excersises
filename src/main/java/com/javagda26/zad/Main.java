package com.javagda26.zad;

public class Main {
    public static void main(String[] args) {
        RejestrObywateli rejestrObywateli = new RejestrObywateli();
        rejestrObywateli.dodajObywatela("77031500543", "Krzysztof", "Zecik");
        rejestrObywateli.dodajObywatela("79022500289", "Rafał", "Liecik");
        rejestrObywateli.dodajObywatela("69041500325", "Ola", "Berecik");
        System.out.println(rejestrObywateli.znajdzObywateliUrodonychPrzed(1978));
        System.out.println(rejestrObywateli.znajdzObywatelaPoNazwisku("Berecik"));
        System.out.println(rejestrObywateli.znajdzObywatelaPoPeselu("79022500289"));
        System.out.println(rejestrObywateli.znajdzObywateliZRokuZImieniem(1969, "Ola"));
    }
}
