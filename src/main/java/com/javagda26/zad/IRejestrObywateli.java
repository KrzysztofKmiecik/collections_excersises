package com.javagda26.zad;
/*
Stwórz klasę RejestrObywateli która posiada wewnątrz (jako pole) mapę obywateli. Dodaj do Rejestru Obywateli metody:
- dodajObywatela(String pesel, String imie, String nazwisko):void
- znajdźObywateliUrodzonychPrzed(int rok):List<Obywatel>
- znajdźObywateliZRokuZImieniem(int rok, String imie):List<Obywatel>
- znajdźObywatelaPoNazwisku(String nazwisko):List<Obywatel>
- znajdźObywatelaPoPeselu(String pesel):Obywatel

 */
public interface IRejestrObywateli {
    void dodajObywatela(String pesel, String imie, String nazwisko);
}
