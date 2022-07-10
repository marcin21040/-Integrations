package com.company;

public class Metoda_trapezow {

    double Funkcja(double x)
    {
        return (Math.sqrt(x*x + 0.3))/(1.4+Math.sqrt(0.8*x*x+1.6));
    }
    double oblicz(double a, double b, int n)
    {
        double h = (b - a) / n;
        double f1 = Funkcja(a)/2;
        double f2 = Funkcja(b)/2;
        double []xi = new double[n];
        double wynik = 0;
        for(int i = 1; i <= n - 1; i++)
        {
            xi[i] = a + (i*(b-a))/n;
            wynik += Funkcja(xi[i]);
        }
        return h*(f1+wynik+f2);
    }
}
