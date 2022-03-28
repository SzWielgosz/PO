import java.util.Scanner;

public class Zad1d {

    static String repeat(String str,int n)
    {
        return str.repeat(n);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis:");
        String napis = scanner.nextLine();
        System.out.print("Podaj liczbe n:");
        int n = scanner.nextInt();
        System.out.print("Powtorzenie:" + repeat(napis, n));
    }
}
