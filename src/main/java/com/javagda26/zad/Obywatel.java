package com.javagda26.zad;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
Stwórz klasę Obywatel, która posiada:
pesel, imie, nazwisko,
 */
@Data
@AllArgsConstructor
public class Obywatel {
    private String pesel;
    private String imie;
    private String nazwisko;


}
