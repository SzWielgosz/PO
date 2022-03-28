package pl.szymonjd.wielgosz;

import java.time.LocalDate;

public class Skrzypce extends Instrument {

    public Skrzypce(String producent, LocalDate dataProdukcji)
    {
        super(producent, dataProdukcji);
    }

    void dzwiek() {
        System.out.println("Skrzyp skrzyp");
    }
}
