import java.util.Scanner;

public class Zad1g {
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
        int[] tab = new int[n];

        for(int i = 0; i < n; i++)
        {
            int min = -999;
            int max = 999;
            tab[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for(int i = lewy, j = prawy; i < j; i++, j--)
        {
            int tmp = tab[i];
            tab[i] = tab[j];
            tab[j] = tmp;
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(tab[i] + " ");
        }
    }
}
