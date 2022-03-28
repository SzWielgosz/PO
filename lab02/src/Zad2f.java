import java.util.Scanner;

public class Zad2f {

    public static void generuj(int[] tab,int n,int minWartosc,int maxWartosc)
    {
        for(int i = 0; i < n; i++)
        {
            tab[i] = (int)Math.floor(Math.random()*(maxWartosc-minWartosc+1)+minWartosc);
        }

    }

    public static void wypisz(int[] tab)
    {
        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void signum(int[] tab)
    {
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > 0)
            {
                tab[i] = 1;
            }
            else if(tab[i] < 0)
            {
                tab[i] = -1;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n z przedzialu 1 <= n <= 100:");
        int n = scanner.nextInt();

        while (n < 0 || n > 100)
        {
            System.out.println("Zla liczba!");
            System.out.print("Podaj liczbe n z przedzialu 1 <= n <= 100:");
            n = scanner.nextInt();
        }
        int[] tab = new int[n];
        generuj(tab, n, -999, 999);
        wypisz(tab);
        signum(tab);
        wypisz(tab);

    }
}
