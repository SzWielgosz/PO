import java.util.Scanner;

public class Zad1c {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n z przedzialu 1 <= n <= 100:");
        int ilosc = 1;
        int n = scanner.nextInt();

        while (n < 0 || n > 100)
        {
            System.out.println("Zla liczba!");
            System.out.print("Podaj liczbe n z przedzialu 1 <= n <= 100:");
            n = scanner.nextInt();
        }
        int[] tab = new int[n];

        for(int i = 0; i < n; i++)
        {
            int min = -999;
            int max = 999;
            tab[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }

        int max_szukane = tab[0];
        for(int i = 1; i < n; i++)
        {
            if(max_szukane == tab[i])
            {
                ilosc++;
            }
            if(max_szukane < tab[i])
            {
                max_szukane = tab[i];
                ilosc = 1;
            }
        }

        System.out.println("Maksymalna wartosc = " + max_szukane + " Ilosc wystapien = " + ilosc);

    }
}