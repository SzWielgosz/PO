package Z3;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Zadanie3 {
    public static File[] sortowanie(File[] tablica)
    {
        Comparator<File> comparator = (x, y) -> {
            if(x.isDirectory() || y.isDirectory())
            {
                return 1;
            }
            return x.compareTo(y);
        };

        Arrays.sort(tablica, comparator);
        return tablica;
    }

    public static void main(String[] args) {
        File[] files = new File[5];
        files[0] = new File("src\\Z1");
        files[1] = new File("src\\Z2");
        files[2] = new File("src\\Z3");
        files[3] = new File("src\\readme");
        files[4] = new File("src\\Z1\\ArrayUtil.java");

        System.out.println(Arrays.toString(sortowanie(files)));

    }
}
