package pl.szymon.wielgosz;
import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen)
    {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen()
    {
        return sredniaOcen;
    }

    public int compareTo(Student student)
    {
        if(super.compareTo(student) == 0)
        {
            return Double.compare(student.sredniaOcen, this.sredniaOcen);
        }
        return super.compareTo(student);
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "\n[" + this.getNazwisko() + " " + this.getDataUrodzenia() + " " + sredniaOcen +"]\n";
    }
}
