import java.util.ArrayList;

public class Zad2 {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> wynik = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < a.size() && j < b.size())
        {
            wynik.add(a.get(i));
            wynik.add(b.get(j));
            i++;
            j++;
        }

        while (i < a.size())
        {
            wynik.add(a.get(i));
            i++;
        }

        while (j < b.size())
        {
            wynik.add(b.get(j));
            j++;
        }

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
        ArrayList<Integer> wynik = merge(a, b);
        wypisz(wynik);
    }
}
