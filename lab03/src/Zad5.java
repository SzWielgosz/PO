import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

public class Zad5 {

    static BigDecimal wielkoscKapitalu(BigDecimal kapital, int lata, double procent)
    {
        BigDecimal tmp = new BigDecimal(procent/100);
        for(int i = 0; i < lata; i++)
        {
            kapital = kapital.add(kapital.multiply(tmp));
        }
        return kapital;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj kapital:");
        BigDecimal k = scanner.nextBigDecimal();
        System.out.print("Podaj ilosc lat:");
        int n = scanner.nextInt();
        System.out.print("Podaj procent:");
        double p = scanner.nextDouble();
        BigDecimal wynik = wielkoscKapitalu(k, n, p);
        wynik = wynik.setScale(2, RoundingMode.HALF_EVEN);
        System.out.print("Kapital po uplywie " + n + " lat z oprocentowaniem " + p +": jest rowny:" + wynik);

    }
}
