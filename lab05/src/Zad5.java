import java.util.ArrayList;

public class Zad5 {

    public static void reverse(ArrayList<Integer> a)
    {
        for(int i = 0, j = a.size() - 1; i < a.size() / 2; i++, j--)
        {
            int tmp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, tmp);
        }
    }

    public static boolean reverse_check(ArrayList<Integer> a, ArrayList<Integer> b)
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
        ArrayList<Integer> wynik = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i: tab)
        {
            wynik.add(i);
            b.add(i);
        }
        reverse(wynik);
        wypisz(wynik);
        System.out.print(reverse_check(wynik, b));
    }
}
