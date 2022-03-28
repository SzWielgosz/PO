import java.util.Scanner;

public class Zad1d {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n z przedzialu 1 <= n <= 100:");
        int n = scanner.nextInt();
        int suma_ujemnych = 0;
        int suma_dodatnich = 0;

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
            if(tab[i] > 0)
            {
                suma_dodatnich += tab[i];
            }
            else if(tab[i] < 0)
            {
                suma_ujemnych += tab[i];
            }
        }

        System.out.println("Suma dodatnich liczb = " + suma_dodatnich + " Suma ujemnych liczb = " + suma_ujemnych);

    }
}
