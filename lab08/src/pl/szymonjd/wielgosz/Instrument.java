package pl.szymonjd.wielgosz;

import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji)
    {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    abstract void dzwiek();

    public String getProducent()
    {
        return producent;
    }

    public LocalDate getRokProdukcji()
    {
        return rokProdukcji;
    }

    @Override
    public boolean equals(Object cos)
    {
        if (this == cos)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder wynik = new StringBuilder();
        wynik.append("Producent:" + this.producent + "\n");
        wynik.append("Rok produkcji:" + this.rokProdukcji);
        return wynik.toString();
    }
}
