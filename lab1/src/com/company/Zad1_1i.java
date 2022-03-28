package com.company;
import java.util.Scanner;

public class Zad1_1i {
    static int silnia(int n)
    {
        int wynik = 1;
        for(int i = 2; i <= n; i++)
        {
            wynik *= i;
        }
        return wynik;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        double wynik = 0;

        for(int i = 1; i <= n; i++)
        {
            System.out.print("Podaj " + i + " liczbe:");
            double a = scanner.nextDouble();
            wynik += (Math.pow(-1, i) * a)/silnia(i);
        }

        System.out.println("Wynik:" + wynik);
    }
}
