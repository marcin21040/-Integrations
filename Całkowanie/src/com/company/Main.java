package com.company;

public class Main {

    public static void main(String[] args) {

        Metoda_trapezow m1 = new Metoda_trapezow();
        System.out.println("Metoda Trapezów = " + m1.oblicz(0.3,1.5,16));
        Metoda_Simpsona m2 = new Metoda_Simpsona();
        System.out.println("Metoda Simpsona = " + m2.oblicz(0.3,1.5,16));
        Kwadratury m3 = new Kwadratury();
        System.out.println("Metoda Kwadratury = " + m3.Oblicz(0.3,1.5,16));
    }
}
