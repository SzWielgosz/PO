package com.company;
import java.util.Scanner;

public class Zad2_1b {

    static boolean czyPodzielna(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        int ilosc = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            int a = scanner.nextInt();
            if (czyPodzielna(a, 3) && !czyPodzielna(a, 5)) {
                ilosc++;
            }
        }
        System.out.println("Ilosc liczb podzielnych przez 3 i niepodzielnych przez 5 wynosi:" + ilosc);
    }
}
