import pl.szymon.wielgosz.Osoba;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args)
    {
        ArrayList<Osoba>tab = new ArrayList<>();
        tab.add(new Osoba("Kowalski", LocalDate.of(1999, 12, 20)));
        tab.add(new Osoba("Kowalski", LocalDate.of(1998, 5, 10)));
        tab.add(new Osoba("Brzeczyszczykiewicz", LocalDate.of(1999, 10, 20)));
        tab.add(new Osoba("Brzeczyszczykiewiczowna", LocalDate.of(1999, 10, 20)));
        tab.add(new Osoba("Wielgosz", LocalDate.of(2001, 11, 4)));

        System.out.println(tab);
        Collections.sort(tab);
        System.out.println("----------");
        System.out.println(tab);

    }
}
