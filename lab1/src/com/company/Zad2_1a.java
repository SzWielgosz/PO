package com.company;
import java.util.Scanner;

public class Zad2_1a {

    static boolean czyNieparzysta(int a)
    {
        return a % 2 == 1;
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
            int a = scanner.nextInt();
            if(czyNieparzysta(a))
            {
                ilosc++;
            }
        }
        System.out.println("Liczby nieparzyste:" + ilosc);
    }
}
