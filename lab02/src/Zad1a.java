import java.util.Scanner;

public class Zad1a {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n z przedzialu 1 <= n <= 100:");
        int parzyste = 0;
        int nieparzyste = 0;
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
            int max= 999;
            tab[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(tab[i] % 2 == 0)
            {
                parzyste++;
            }
            else
            {
                nieparzyste++;
            }
        }
        System.out.println("Parzyste = " + parzyste + " Nieparzyste = " + nieparzyste);

    }
}