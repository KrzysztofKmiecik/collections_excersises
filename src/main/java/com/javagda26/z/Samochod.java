package com.javagda26.z;

public class Samochod {
    private final String name;
    private final double mocKM;
    private final double przebieg;
    private final double cena;


    public Samochod(String name, double mocKM, double przebieg, double cena) {
        this.name = name;
        this.mocKM = mocKM;
        this.przebieg = przebieg;
        this.cena = cena;
    }

    public String getName() {
        return this.name;
    }

    public double getPrzebieg() {
        return this.przebieg;
    }

    public double getMocKM() {
        return this.mocKM;

    }
public double getCena(){
        return this.cena;
}
    @Override
    public String toString() {
        return "Samochod{" +
                "name='" + name + '\'' +
                ", mocKM=" + mocKM +
                ", przebieg=" + przebieg +
                ", cena=" + cena +
                '}';
    }
}
