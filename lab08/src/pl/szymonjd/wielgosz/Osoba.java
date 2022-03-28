package pl.szymonjd.wielgosz;

import java.time.LocalDate;

public class Osoba {
    private String[] imiona;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean plec)
    {
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String[] getImiona()
    {
        return imiona;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }

    public boolean getPlec()
    {
        return plec;
    }
}
