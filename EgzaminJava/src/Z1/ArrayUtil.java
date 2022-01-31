package Z1;
import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayUtil {
    public static<T> ArrayList<T> removeRepeatedElements(T[] tab)
    {
        ArrayList<T> wynik = new ArrayList<>();
        for(int i = 0; i < tab.length; i++)
        {
            if(!wynik.contains(tab[i]))
            {
                wynik.add(tab[i]);
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        Character[] tabChar = new Character[5];
        tabChar[0] = 's';
        tabChar[1] = 's';
        tabChar[2] = 'x';
        tabChar[3] = 'z';
        tabChar[4] = 'b';

        LocalDate[] tabLocalDate = new LocalDate[4];
        tabLocalDate[0] = LocalDate.of(1992, 2, 3);
        tabLocalDate[1] = LocalDate.of(1991, 3, 11);
        tabLocalDate[2] = LocalDate.of(2000, 1, 3);
        tabLocalDate[3] = LocalDate.of(1992, 2, 3);
        System.out.println(removeRepeatedElements(tabLocalDate));

        System.out.println(removeRepeatedElements(tabChar));
    }

}
