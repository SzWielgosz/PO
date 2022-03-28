import java.math.BigInteger;
import java.util.Scanner;

public class Zad4 {

    static void wypisz(BigInteger[][] macierz)
    {
        for(int i = 0; i < macierz.length; i++)
        {
            for(int j = 0; j < macierz[i].length; j++)
            {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n:");
        int n = scanner.nextInt();
        BigInteger[][] macierz = new BigInteger[n][n];
        BigInteger seed = new BigInteger("1");
        BigInteger wynik = new BigInteger("0");
        BigInteger x = new BigInteger("2");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                macierz[i][j] = seed;
                seed = seed.multiply(x);
                wynik = wynik.add(macierz[i][j]);
            }
        }
        wypisz(macierz);
        System.out.println("Wynik = " + wynik);
    }
}
