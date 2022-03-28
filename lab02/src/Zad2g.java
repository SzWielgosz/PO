import java.util.Scanner;

public class Zad2g {

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

    public static void odwrocFragment(int[] tab,int lewy,int prawy)
    {
        for(int i = lewy, j = prawy; i < j; i++, j--)
        {
            int tmp = tab[i];
            tab[i] = tab[j];
            tab[j] = tmp;
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

        System.out.print("Podaj lewy z przedzialu 1 <= lewy < n:");
        int lewy = scanner.nextInt();
        while(lewy < 0 || lewy > n - 1)
        {
            System.out.println("Zla liczba!");
            System.out.print("Podaj lewy z przedzialu 1 <= lewy < n:");
            lewy = scanner.nextInt();
        }
        System.out.print("Podaj prawy z przedzialu 1 <= prawy < n:");
        int prawy = scanner.nextInt();
        while(prawy < 0 || prawy > n - 1)
        {
            System.out.println("Zla liczba!");
            System.out.print("Podaj prawy z przedzialu 1 <= prawy < n:");
            prawy = scanner.nextInt();
        }
        wypisz(tab);
        odwrocFragment(tab, lewy, prawy);
        wypisz(tab);

    }
}
