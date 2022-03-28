package pl.szymonjd.wielgosz;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String Nazwisko, int rokUrodzenia)
    {
        this.nazwisko = Nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString()
    {
        return "Nazwisko: " + nazwisko +"\nrokUrodzenia: " + rokUrodzenia;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public int getRokUrodzenia()
    {
        return rokUrodzenia;
    }
}

