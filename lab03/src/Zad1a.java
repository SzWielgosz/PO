import java.util.Scanner;

public class Zad1a {

    static int countChar(String str, char c)
    {
        int liczebnosc = 0;
        for(int i = 0;i < str.length(); i++)
        {
            if(str.charAt(i) == c)
            {
                liczebnosc++;
            }
        }
        return liczebnosc;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj slowo:");
        String x = scanner.nextLine();
        System.out.print("Podaj litere:");
        char c = scanner.next().charAt(0);
        System.out.println("Liczebnosc " + c + " w slowie " + x + " jest rowna:" + countChar(x, c));

    }
}
