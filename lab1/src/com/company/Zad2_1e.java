package com.company;
import java.util.Scanner;

public class Zad2_1e {

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
        int[] tab = new int[n];
        int ilosc = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            int a = scanner.nextInt();
            tab[i] = a;
        }

        for(int i = 0; i < n; i++)
        {
            if(Math.pow(2, i + 1) < tab[i] && tab[i] < silnia(i + 1))
            {
                ilosc++;
            }
        }

        System.out.println("Liczby spelniajace warunek:" + ilosc);
    }
}
