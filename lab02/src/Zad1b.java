import java.util.Scanner;

public class Zad1b {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n z przedzialu 1 <= n <= 100:");
        int zera = 0;
        int ujemne = 0;
        int dodatnie = 0;
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
            if(tab[i] > 0)
            {
                dodatnie++;
            }
            else if(tab[i] == 0)
            {
                zera++;
            }
            else
            {
                ujemne++;
            }
        }
        System.out.println("Dodatnie = " + dodatnie + " Ujemne = " + ujemne + " Zera = " + zera);


    }
}
