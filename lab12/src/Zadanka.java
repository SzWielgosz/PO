import java.lang.reflect.Array;
import java.util.*;

public class Zadanka {
    public static ArrayList<Integer> append(ArrayList<Integer>a, ArrayList<Integer>b)
    {
        ArrayList<Integer>wynik = new ArrayList<>(a);
        wynik.addAll(b);
        return wynik;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer>a, ArrayList<Integer>b)
    {
        ArrayList<Integer>wynik = new ArrayList<>();
        if(a.size() > b.size()) {
            for (int i = 0; i < b.size(); i++) {
                wynik.add(a.get(i));
                wynik.add(b.get(i));
            }

            for (int i = b.size() - 1; i < a.size(); i++) {
                wynik.add(b.get(i));
            }
        }
        else
        {
            for (int i = 0; i < a.size(); i++) {
                wynik.add(a.get(i));
                wynik.add(b.get(i));
            }

            for (int i = b.size() - 1; i < b.size(); i++) {
                wynik.add(b.get(i));
            }
        }
        return wynik;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer>a, ArrayList<Integer>b)
    {
        ArrayList<Integer> wynik = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < a.size() && j < b.size())
        {
            if(a.get(i) < b.get(j))
            {
                wynik.add(a.get(i));
                i++;
            }
            else
            {
                wynik.add(b.get(j));
                j++;
            }
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

    public static void reverse(ArrayList<Integer> a)
    {
        for(int i = 0, j = a.size() - 1; i < a.size() / 2; i++, j--)
        {
            int tmp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, tmp);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer>a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList<Integer>b = new ArrayList<>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        ArrayList<Integer>c = merge(a, b);
        System.out.println(c);

        Collections.sort(a);
        Collections.sort(b);

        ArrayList<Integer>d = mergeSorted(a, b);

        System.out.println(d);

    }
}
