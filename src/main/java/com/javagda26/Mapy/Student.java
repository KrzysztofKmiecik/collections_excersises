package com.javagda26.Mapy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data//getter,sette,requredargsconstructor,tostring,equalhashcode
@AllArgsConstructor
@NoArgsConstructor

public class Student {
   private  long numerIndeksu;
   private  String imie,nazwisko;


}
