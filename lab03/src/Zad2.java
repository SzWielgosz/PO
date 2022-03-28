import java.util.Scanner;
import java.io.*;

public class Zad2
{

    public static void main(String[] args)
    {
        int liczebnosc = 0;
        try {
            File plik = new File("Tekst.txt");
            Scanner fileReader = new Scanner(plik);
            Scanner scanner = new Scanner(System.in);
            char x = scanner.next().charAt(0);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                for(int i = 0; i < data.length(); i++)
                {
                    if(x == data.charAt(i))
                    {
                       liczebnosc++;
                    }
                }
                System.out.println(data);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Blad");
            e.printStackTrace();
        }
        System.out.print("Liczebnosc = " + liczebnosc);
    }
}
