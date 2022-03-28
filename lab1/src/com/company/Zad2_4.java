package com.company;
import java.util.Scanner;

public class Zad2_4 {

    static double minimum(double[] tab)
    {
        double min = tab[0];
        for(int i = 1; i < tab.length; i++)
        {
            if(min > tab[i])
            {
                min = tab[i];
            }
        }
        return min;
    }

    static double maksimum(double[] tab)
    {
        double max = tab[0];
        for(int i = 1; i < tab.length; i++)
        {
            if(max < tab[i])
            {
                max = tab[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        double[] tab = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            double a = scanner.nextDouble();
            tab[i] = a;
        }
        System.out.print("Minimum:" + minimum(tab) + " Maksimum:" + maksimum(tab));

    }
}
