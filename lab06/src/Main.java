import java.math.BigDecimal;

public class Main {
    public static void main(String[] args)
    {
        RachunekBankowy saver1 = new RachunekBankowy();
        saver1.setSaldo(new BigDecimal(2000));
        RachunekBankowy saver2 = new RachunekBankowy();
        saver2.setSaldo(new BigDecimal(3000));
        RachunekBankowy.rocznaStopaProcentowa = 4.0;
        saver1.obliczMiesieczneOdsetki();
        RachunekBankowy.rocznaStopaProcentowa = 5.0;
        saver2.obliczMiesieczneOdsetki();


        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.insertElement(10);
        set1.insertElement(51);
        set1.insertElement(20);
        set1.deleteElement(20);

        set2.insertElement(10);
        set2.insertElement(51);

        System.out.println(set1.equals(set2));
        System.out.println(set1.equals2(set2));
        set1.insertElement(61);
        set1.insertElement(24);

        IntegerSet suma = IntegerSet.union(set1, set2);
        IntegerSet czescWspolna = IntegerSet.intersection(set1, set2);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("Suma setu1 i setu2 = " + suma);
        System.out.println("Czesc wspolna setu1 i setu2 = " + czescWspolna);

    }
}
