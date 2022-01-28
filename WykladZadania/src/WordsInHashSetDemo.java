import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WordsInHashSetDemo {
    public static void main(String[] args) throws FileNotFoundException {

        // Klasa HashSet implementuje interfejs Set
        Set<String> words = new HashSet<>();
        long Time = 0;

        File file1 = new File("zad.txt");
        Scanner in = new Scanner(file1);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            Time += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .\n");
        System.out.println("HashSet :");
        System.out.println(words.size() + " unikalnych słów. " + "czas: " + Time);
    }
}