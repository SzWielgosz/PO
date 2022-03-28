import java.util.Scanner;


public class Zad1h {

    static String nice(String str, int pozycja, char znak)
    {
        StringBuffer strBuffer = new StringBuffer();
        int tmp = 1;
        for(int i = str.length() - 1; i >= 0; i--)
        {
            strBuffer.append(str.charAt(i));
            if(tmp == pozycja)
            {
                strBuffer.append(znak);
                tmp = 0;
            }
            tmp++;
        }
        strBuffer.reverse();
        return strBuffer.toString();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis:");
        String napis = scanner.nextLine();
        System.out.print("Podaj pozycje:");
        int pozycja = scanner.nextInt();
        System.out.print("Podaj znak");
        char znak = scanner.next().charAt(0);
        System.out.println(nice(napis, pozycja, znak));
    }
}
