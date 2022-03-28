import java.util.Scanner;

public class Zad2e {

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

    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab)
    {
        int dlugosc = 0;
        int wynik = 0;
        for (int i : tab) {
            if (i < 0) {
                dlugosc = 0;
            } else if (i > 0) {
                dlugosc++;
                if (wynik < dlugosc) {
                    wynik = dlugosc;
                }
            }
        }
        return wynik;
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

        System.out.println("Najdluzszy fragment tablicy wynosi:" + dlugoscMaksymalnegoCiaguDodatnich(tab));

    }
}
