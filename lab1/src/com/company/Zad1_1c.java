package com.company;
import java.util.Scanner;

public class Zad1_1c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        double suma = 0;

        for (int i = 1; i <= n; ++i) {
            System.out.print("Podaj " + i + " liczbe:");
            double a = Math.abs(scanner.nextDouble());
            suma += a;
        }
        System.out.println("Suma wynosi:" + suma);

    }




}
