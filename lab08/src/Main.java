import pl.szymonjd.wielgosz.Osoba;
import pl.szymonjd.wielgosz.Pracownik;
import pl.szymonjd.wielgosz.Student;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        Student studenciak = new Student(new String[]{"Janek", "Marek"}, "Dzbanek", LocalDate.of(2000, 12, 10), true, 4.5);

        Pracownik sprzedawca = new Pracownik(new String[]{"Anna", "Monika"}, "Kowalska", LocalDate.of(1999, 10, 1), false, LocalDate.now());

        Osoba osoba = new Osoba(new String[]{"Andrzej"}, "Marczuk", LocalDate.of(1995, 5, 2), true);

        for(String i: studenciak.getImiona())
        {
            System.out.println(i);
        }
        System.out.println(sprzedawca.getDataZatrudnienia());
        System.out.println(osoba.getPlec());

    }
}
