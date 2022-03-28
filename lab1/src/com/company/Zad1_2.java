package com.company;
import java.util.Scanner;

public class Zad1_2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        double[] array = new double[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            double a = scanner.nextDouble();
            array[i] = a;
        }

        for(int i = 1; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.print(array[0] + " ");
    }
}
