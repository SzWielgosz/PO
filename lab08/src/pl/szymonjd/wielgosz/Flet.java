package pl.szymonjd.wielgosz;

import java.time.LocalDate;

public class Flet extends Instrument {

    public Flet(String producent, LocalDate dataProdukcji)
    {
        super(producent, dataProdukcji);
    }

    void dzwiek() {
        System.out.println("Fiufiufiu");
    }
}
