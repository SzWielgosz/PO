import java.math.BigDecimal;
import java.math.RoundingMode;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private BigDecimal saldo;

    public void setSaldo(BigDecimal newSaldo)
    {
        saldo = newSaldo;
    }
    public void obliczMiesieczneOdsetki()
    {
        BigDecimal stopa = new BigDecimal(rocznaStopaProcentowa / 100);
        BigDecimal miesiace = new BigDecimal(12);
        BigDecimal odsetki = saldo.multiply(stopa).divide(miesiace, 2, RoundingMode.CEILING);
        this.saldo = this.saldo.add(odsetki);
        System.out.print("Odsetki wynosza: " + odsetki + " a saldo: " + this.saldo);
        System.out.println();
    }
}
