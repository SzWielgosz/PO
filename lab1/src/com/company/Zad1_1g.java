package com.company;

import java.util.Scanner;

public class Zad1_1g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        double[] tab = new double[n];
        double suma = 0;
        double iloczyn = 1;
        for (int i = 0; i < n; ++i) {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            double a = scanner.nextDouble();
            tab[i] = a;
            suma += a;
        }
        System.out.println("Suma wynosi:" + suma);
        for (int i = 0; i < n; ++i) {
            iloczyn *= tab[i];
        }
        System.out.println("Iloczyn wynosi:" + iloczyn);
    }
}
