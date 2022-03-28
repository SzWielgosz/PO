import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args)
    {
        int liczebnosc = 0;
        try {
            File plik = new File("Tekst.txt");
            Scanner fileReader = new Scanner(plik);
            Scanner scanner = new Scanner(System.in);
            String x = scanner.nextLine();
            while (fileReader.hasNext()) {
                String tmp = fileReader.next();
                if(tmp.equals(x))
                {
                    liczebnosc++;
                }
                System.out.println(tmp);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Blad");
            e.printStackTrace();
        }
        System.out.print("Liczebnosc = " + liczebnosc);
    }
}
