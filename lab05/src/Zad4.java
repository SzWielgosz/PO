import java.util.ArrayList;

public class Zad4 {

    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> wynik = new ArrayList<>(a);
        for(int i = 0, j = wynik.size() - 1; i < wynik.size() / 2; i++, j--)
        {
            int tmp = wynik.get(i);
            wynik.set(i, wynik.get(j));
            wynik.set(j, tmp);
        }
        return wynik;
    }

    public static boolean reversed_check(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        if(a.size() != b.size())
        {
            return false;
        }
        for(int i = 0, j = b.size() - 1; i < a.size() / 2; i++, j--)
        {
            if(!a.get(i).equals(b.get(j)))
            {
                return false;
            }
        }
        return true;
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
        int[] tab = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        ArrayList<Integer> a = new ArrayList<>();
        for(int i: tab)
        {
            a.add(i);
        }
        ArrayList<Integer> wynik = reversed(a);
        wypisz(wynik);
        System.out.print(reversed_check(a, wynik));
    }
}
