import java.lang.*;
import java.util.Scanner;

public class Zad1f {

    static String change(String str)
    {
        StringBuffer wynik = new StringBuffer();
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                wynik.append(Character.toLowerCase(str.charAt(i)));
            }
            else
            {
                wynik.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return wynik.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis:");
        String napis = scanner.nextLine();
        System.out.println(change(napis));
    }
}
