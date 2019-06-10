package com.javagda26.zad;

import java.util.List;

/*
Stwórz klasę RejestrObywateli która posiada wewnątrz (jako pole) mapę obywateli.
Dodaj do Rejestru Obywateli metody:
- dodajObywatela(String pesel, String imie, String nazwisko):void
- znajdźObywateliUrodzonychPrzed(int rok):List<Obywatel>
- znajdźObywateliZRokuZImieniem(int rok, String imie):List<Obywatel>
- znajdźObywatelaPoNazwisku(String nazwisko):List<Obywatel>
- znajdźObywatelaPoPeselu(String pesel):Obywatel

 */
public interface IRejestrObywateli {
    void dodajObywatela(String pesel, String imie, String nazwisko);

    List<Obywatel> znajdzObywateliUrodonychPrzed(int rok);

    List<Obywatel> znajdzObywateliZRokuZImieniem(int rok, String imie);

    List<Obywatel> znajdzObywatelaPoNazwisku(String nazwisko);

    List<Obywatel> znajdzObywatelaPoPeselu(String pesel);
}
