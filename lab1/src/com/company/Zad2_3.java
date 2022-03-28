package com.company;

import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        int ilosc_dodatnich = 0;
        int ilosc_ujemnych = 0;
        int ilosc_zer = 0;
        double[] tab = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            double a = scanner.nextDouble();
            tab[i] = a;
        }

        for (int i = 0; i < n; i++)
        {
            if(tab[i] > 0)
            {
                ilosc_dodatnich++;
            }
            else if(tab[i] == 0)
            {
                ilosc_zer++;
            }
            else
            {
                ilosc_ujemnych++;
            }
        }

        System.out.println("ilosc dodatnich:" + ilosc_dodatnich + " ilosc ujemnych:" + ilosc_ujemnych + " ilosc zer:" + ilosc_zer);

    }
}
