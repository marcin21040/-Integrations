package com.company;

public class Metoda_Simpsona {

    double Funkcja(double x)
    {
        return (Math.sqrt(x*x + 0.3))/(1.4+Math.sqrt(0.8*x*x+1.6));

    }
    double oblicz(double a, double b, int n)
    {
        double []xi = new double[n+1];
        double []ti = new double[n];
        double h = 0;
        for (int j = 0; j <= n; j++){
            xi[j] = a + (j*(b-a))/n;
        }
       double wynik = 0;
       for(int i = 0; i <= n - 1; i++)
       {
           h = (xi[i + 1] - xi[i]) / 2;
           ti[i] = (xi[i+1] + xi[i]) / 2;
           wynik +=(h/3)*(Funkcja(xi[i])+ 4* Funkcja(ti[i])+ Funkcja(xi[i+1]));
       }
       return wynik;
    }
}
