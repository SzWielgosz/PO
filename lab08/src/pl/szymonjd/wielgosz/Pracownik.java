package pl.szymonjd.wielgosz;

import java.time.LocalDate;

public class Pracownik extends Osoba {
    private LocalDate dataZatrudnienia;

    public Pracownik(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean plec, LocalDate dataZatrudnienia)
    {
        super(imiona, nazwisko, dataUrodzenia, plec);
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }
}
