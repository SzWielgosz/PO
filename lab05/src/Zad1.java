import java.util.ArrayList;

public class Zad1 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> wynik = new ArrayList<>();
        wynik.addAll(a);
        wynik.addAll(b);
        return wynik;
    }
    public static void wypisz(ArrayList<Integer> a)
    {
        for(int i: a)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] tab1 = {1, 4, 9, 16};
        ArrayList<Integer> a = new ArrayList<>();
        for(int i:tab1)
        {
            a.add(i);
        }
        int[] tab2 = {9, 7, 4, 9, 11};
        ArrayList<Integer> b = new ArrayList<>();
        for(int i:tab2)
        {
            b.add(i);
        }
        ArrayList<Integer> wynik = append(a, b);
        wypisz(wynik);
    }
}
