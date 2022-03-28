package com.company;

import java.util.Scanner;

public class Zad2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        double[] tab = new double[n];
        int ilosc = 0;


        for (int i = 0; i < n; i++)
        {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            double x = scanner.nextDouble();
            tab[i] = x;
        }

        for(int i = 0; i < n - 1; i++)
        {
            if(tab[i] > 0 && tab[i + 1] > 0)
            {
                System.out.print("(" + tab[i] + "," + tab[i + 1] + ")");
                ilosc++;
            }
        }
        System.out.println(" = " + ilosc + "par/y");

    }
}
