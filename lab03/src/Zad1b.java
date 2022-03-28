import java.util.Scanner;

public class Zad1b {

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


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis:");
        String napis = scanner.nextLine();
        System.out.print("Podaj podnapis:");
        String podnapis = scanner.nextLine();
        System.out.print("Ilosc wystapien:" + countSubStr(napis, podnapis));
    }
}
