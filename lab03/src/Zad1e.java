import java.util.Scanner;

public class Zad1e {

    static int countSubStr(String str, String subStr)
    {
        int liczebnosc = 0;
        int x = 0;
        while(true)
        {
            if(str.indexOf(subStr, x) != -1)
            {
                x = str.indexOf(subStr, x) + 1;
                liczebnosc++;
            }
            else
            {
                break;
            }
        }
        return liczebnosc;
    }

    static int[] where(String str, String subStr)
    {
        int[] wynik = new int[countSubStr(str, subStr)];
        int indeks = 0;
        int x = 0;
        while(true)
        {
            if(str.indexOf(subStr, x) != -1)
            {
                wynik[indeks] = str.indexOf(subStr, x);
                x = str.indexOf(subStr, x) + 1;
                indeks++;
            }
            else
            {
                break;
            }
        }
        return wynik;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis:");
        String napis = scanner.nextLine();
        System.out.print("Podaj podnapis:");
        String podnapis = scanner.nextLine();
        int[] x = where(napis, podnapis);
        for (int i : x) {
            System.out.print(i + " ");
        }

    }
}
