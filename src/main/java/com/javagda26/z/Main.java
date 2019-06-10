package com.javagda26.z;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> listy = Arrays.asList("a", "bb", "ccc");
        for (String s : listy) {
            System.out.println(s);
        }
        listy.forEach(s -> System.out.println(s));
        ///////
        List<Integer> dane = Arrays.asList(5, 9, 1, 7, 2);
        dane.forEach(f -> System.out.println(f));
        Collections.sort(dane, (o1, o2) -> o1.compareTo(o2));
        dane.forEach(i -> System.out.println(i));
        /////

        List<Samochod> samochods = Arrays.asList(
                new Samochod("Skoda", 1600, 100, 60000),
                new Samochod("VW", 2600, 200, 60000),
                new Samochod("Skoda", 1600, 300, 60000),
                new Samochod("Skoda", 2600, 400, 90000),
                new Samochod("Skoda", 1600, 500, 60000)


        );
      //  samochods.forEach(f -> System.out.println(f));

        samochods.stream()
                .filter(a -> a.getPrzebieg()>300)
                .map(a->a.getName().toUpperCase())
                .forEach(System.out::println);
                ;

      // samochods.forEach(f-> System.out.println(f));

//        Consumer<Samochod> integerConsumer = n -> System.out.println(n);
//        samochods.forEach(integerConsumer);
       // samochods.forEach(System.out::println);
    }
}
