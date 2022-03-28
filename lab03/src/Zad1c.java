import java.util.Scanner;

public class Zad1c {

    static String middle(String str)
    {
        if(str.length() % 2 == 0)
        {
            char[] x = {str.charAt((str.length() / 2) - 1), str.charAt(str.length() / 2)};
            return String.valueOf(x);
        }
        else
        {
            char x = str.charAt(str.length() / 2);
            return String.valueOf(x);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis:");
        String napis = scanner.nextLine();
        System.out.print("Srodkowy znak:" + middle(napis));
    }
}
