package com.company;
import java.util.Scanner;

public class Zad2_1c {

    static boolean czyParzysta(double a)
    {
        return a % 2 == 0;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        int ilosc = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            double a = scanner.nextInt();
            if(czyParzysta(Math.sqrt(a)))
            {
                ilosc++;
            }
        }

        System.out.println("Liczby bedace kwadratami liczby parzystej:" + ilosc);
    }
}
