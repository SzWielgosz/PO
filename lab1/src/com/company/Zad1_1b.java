package com.company;
import java.util.Scanner;

public class Zad1_1b {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        double iloczyn = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print("Podaj " + i + " liczbe:");
            double a = scanner.nextDouble();
            iloczyn *= a;
        }
        System.out.println("Iloczyn wynosi:" + iloczyn);
    }

}
