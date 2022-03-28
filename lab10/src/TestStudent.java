import pl.szymon.wielgosz.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args)
    {
        ArrayList<Osoba>tab = new ArrayList<>();
        tab.add(new Student("Kowalski", LocalDate.of(1999, 12, 20), 3.5));
        tab.add(new Student("Kowalski", LocalDate.of(1998, 5, 10), 3.0));
        tab.add(new Student("Brzeczyszczykiewicz", LocalDate.of(1999, 10, 20), 3.3));
        tab.add(new Student("Brzeczyszczykiewiczowna", LocalDate.of(1999, 10, 20), 4.0));
        tab.add(new Student("Wielgosz", LocalDate.of(2001, 11, 4), 5.0));

        System.out.println(tab);
        Collections.sort(tab);
        System.out.println("----------");
        System.out.println(tab);

    }
}
