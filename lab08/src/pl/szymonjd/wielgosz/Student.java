package pl.szymonjd.wielgosz;

import java.time.LocalDate;

public class Student extends Osoba {
    private double sredniaOcen;

    public Student(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean plec, double sredniaOcen)
    {
        super(imiona, nazwisko, dataUrodzenia, plec);
        this.sredniaOcen = sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen)
    {
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen()
    {
        return sredniaOcen;
    }
}
