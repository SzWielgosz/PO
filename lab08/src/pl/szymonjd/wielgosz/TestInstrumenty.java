package pl.szymonjd.wielgosz;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args)
    {
//        ArrayList<Instrument> orkiestra = new ArrayList<>();
//        orkiestra.add(new Flet("Andrzej", LocalDate.of(2020, 10, 5)));
//        orkiestra.add(new Skrzypce("Waclaw", LocalDate.of(2020, 9, 1)));
//        orkiestra.add(new Fortepian("Michalek", LocalDate.of(2020, 7, 14)));
//        orkiestra.add(new Skrzypce("Eustachy", LocalDate.of(2019, 12, 12)));
//        orkiestra.add(new Flet("Witold", LocalDate.of(2019, 10, 4)));
//        for (Instrument instrument : orkiestra) {
//            instrument.dzwiek();
//            System.out.println(instrument);
//        }
        Skrzypce skrzyp = new Skrzypce("Waldek", LocalDate.now());
        Fortepian fort = new Fortepian("Waldek", LocalDate.now());
        System.out.println(skrzyp.equals(fort));

    }
}
