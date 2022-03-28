import java.util.Scanner;

public class Zad1e {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n z przedzialu 1 <= n <= 100:");
        int n = scanner.nextInt();
        int dlugosc = 0;
        int wynik = 0;

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
            System.out.print(tab[i] + " ");
        }
        for(int i = 0; i < n; i++)
        {
            if(tab[i] < 0)
            {
                dlugosc = 0;
            }
            else if(tab[i] > 0)
            {
                dlugosc++;
                if(wynik < dlugosc)
                {
                    wynik = dlugosc;
                }
            }
        }
        System.out.println("Najdluzszy fragment tablicy wynosi:" + wynik);

    }
}
