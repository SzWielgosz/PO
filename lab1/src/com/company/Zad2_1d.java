package com.company;
import java.util.Scanner;

public class Zad2_1d {
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

        for(int i = 1; i < n - 1; i++)
        {
            if(tab[i] < (tab[i - 1] + tab[i + 1]) / 2)
            {
                ilosc++;
            }
        }

        System.out.println("Liczby spelniajace warunek:" + ilosc);
    }
}
