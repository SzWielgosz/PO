package com.company;
import java.util.Scanner;

public class Zad2_2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        int suma = 0;
        double[] tab = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            double a = scanner.nextDouble();
            tab[i] = a;
        }

        for (int i = 0; i < n; i++)
        {
            if (tab[i] > 0)
            {
                suma += tab[i];
            }
        }

        suma *= 2;
        System.out.print("Podwojona suma wynosi:" + suma);
    }
}
