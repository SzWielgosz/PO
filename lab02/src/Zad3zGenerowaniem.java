import java.util.Scanner;

public class Zad3zGenerowaniem {

    public static int generuj(int minWartosc,int maxWartosc)
    {
            return (int)Math.floor(Math.random()*(maxWartosc-minWartosc+1)+minWartosc);
    }


    public static void generujWartosci(int[][] tab, int a, int b)
    {
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                tab[i][j] = generuj(-999, 999);
            }
        }
    }

    public static void wypiszWartosci(int[][] tab, int a, int b)
    {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
            {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] mnozenieMacierzy(int[][]tab1, int a, int b, int[][]tab2, int c, int d)
    {
        int[][] wynik = new int[a][d];
        if(b == c)
        {
            for(int i = 0; i < a; i++)
            {
                for(int j = 0; j < d; j++)
                {
                    for(int u = 0; u < c; u++)
                    {
                        wynik[i][j] += tab1[i][u] * tab2[u][j];
                    }
                }
            }
        }
        return wynik;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n z przedzialu [1;10]:");
        int n = scanner.nextInt();
        while(n < 1 || n > 10)
        {
            System.out.println("Zla liczba!");
            System.out.print("Podaj n z przedzialu [1;10]:");
            n = scanner.nextInt();
        }
        System.out.print("Podaj m z przedzialu [1;10]:");
        int m = scanner.nextInt();
        while(m < 1 || m > 10)
        {
            System.out.println("Zla liczba!");
            System.out.print("Podaj m z przedzialu [1;10]:");
            m = scanner.nextInt();
        }
        System.out.print("Podaj k z przedzialu [1;10]:");
        int k = scanner.nextInt();
        while(k < 1 || k > 10)
        {
            System.out.println("Zla liczba!");
            System.out.print("Podaj k z przedzialu [1;10]:");
            k = scanner.nextInt();
        }

        int [][]a = new int[m][n];
        generujWartosci(a, m, n);
        int [][]b = new int[n][k];
        generujWartosci(b, n, k);
        System.out.println("Macierz a " + m + "x" + n);
        wypiszWartosci(a, m, n);
        System.out.println("Macierz b " + n + "x" + k);
        wypiszWartosci(b, n, k);

        int [][]c = mnozenieMacierzy(a, m, n, b, n, k);
        System.out.println("Macierz c " + m + "x" + k);
        wypiszWartosci(c, m, k);
    }
}
