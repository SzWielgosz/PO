package pl.szymonjd.wielgosz;

public class Nauczyciel extends Osoba {
    private double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja)
    {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nPensja: " + pensja;
    }

    public double getPensja()
    {
        return pensja;
    }

}
