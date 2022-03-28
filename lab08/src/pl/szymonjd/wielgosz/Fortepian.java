package pl.szymonjd.wielgosz;

import java.time.LocalDate;

public class Fortepian extends Instrument {

    public Fortepian(String producent, LocalDate dataProdukcji)
    {
        super(producent, dataProdukcji);
    }

    void dzwiek() {
        System.out.println("Tralalala");
    }
}
