package pl.szymon.wielgosz;
import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "\n[" + nazwisko + " " + dataUrodzenia + "]\n";
    }

    @Override
    public boolean equals(Object obiekt)
    {
        Osoba osoba = (Osoba) obiekt;
        return this.nazwisko.equals(osoba.nazwisko) && this.dataUrodzenia.equals(osoba.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba osoba)
    {
        int wynik = this.nazwisko.compareTo(osoba.nazwisko);
        if(wynik == 0)
        {
            wynik = this.dataUrodzenia.compareTo((osoba.dataUrodzenia));
            return wynik;
        }
        return wynik;
    }
}
