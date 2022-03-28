package com.company;
import java.util.Scanner;

public class Zad2_1f {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        int ilosc = 0;
        int[] tab = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            int a = scanner.nextInt();
            tab[i] = a;
        }

        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 1 && tab[i] % 2 == 0)
            {
                ilosc++;
            }
        }

        System.out.println("Ilosc liczb spelniajacych warunek:" + ilosc);
    }
}
