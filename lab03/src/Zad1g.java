import java.util.Scanner;


public class Zad1g {

    static String nice(String str)
    {
        StringBuffer strBuffer = new StringBuffer();
        int tmp = 1;
        for(int i = str.length() - 1; i >= 0; i--)
        {
            strBuffer.append(str.charAt(i));
            if(tmp == 3)
            {
                strBuffer.append("\"");
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
        System.out.println(nice(napis));
    }
}