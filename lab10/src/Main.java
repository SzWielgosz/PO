import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            ArrayList<String> arr = new ArrayList<>();
            try {
                File plik = new File(args[0]);
                Scanner fileReader = new Scanner(plik);
                while (fileReader.hasNextLine()) {
                    String tmp = fileReader.nextLine();
                    arr.add(tmp);
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Blad");
                e.printStackTrace();
            }

            System.out.println(arr);
            Collections.sort(arr);
            System.out.println("-----------");
            System.out.println(arr);
        }
    }
}

