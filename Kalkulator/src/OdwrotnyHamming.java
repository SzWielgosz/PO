import java.util.ArrayList;

public class OdwrotnyHamming {     //kalkulator na zajęcia

    public static void show(ArrayList<Integer> lista)
    {
        ArrayList<Integer> C_numbers = new ArrayList<>();
        C_numbers.add(4);
        C_numbers.add(8);
        C_numbers.add(10);
        C_numbers.add(11);
        int x = 8;
        int y = 7;
        for(int i = 0, j = 0; i < 12; i++)
        {
            if(C_numbers.contains(i))
            {
                System.out.println("C" + x + " " + lista.get(j));
                x /= 2;
                j++;
            }
            else
            {
                System.out.println("M" + y + " " + lista.get(j));
                y--;
                j++;
            }
        }
    }

    public static int count(ArrayList<Integer> list, ArrayList<Integer> oldValues)
    {
        ArrayList<Integer> newValues = new ArrayList<>();
        ArrayList<Integer> finalValues = new ArrayList<>();
        for(int i = 0; i < 4; i++)
        {
            switch (i) {
                case 0 -> newValues.add(list.get(0) ^ list.get(1) ^ list.get(2) ^ list.get(3));
                case 1 -> newValues.add(list.get(7) ^ list.get(6) ^ list.get(5) ^ list.get(0));
                case 2 -> newValues.add(list.get(9) ^ list.get(6) ^ list.get(5) ^ list.get(2) ^ list.get(1));
                case 3 -> newValues.add(list.get(9) ^ list.get(7) ^ list.get(5) ^ list.get(3) ^ list.get(1));
            }
            finalValues.add(oldValues.get(i) ^ newValues.get(i));
        }
        for(int i = 0, j = 11; i < 6; i++, j--)
        {
            int x = list.get(i);
            list.set(i, list.get(j));
            list.set(j, x);
        }
        if(finalValues.contains(1))
        {
            int position = 8 * finalValues.get(0) + 4 * finalValues.get(1) + 2 * finalValues.get(2) + finalValues.get(3) - 1;
            if(list.get(position) == 1)
            {
                list.set(position, 0);
            }
            else
            {
                list.set(position, 1);
            }
        }
        return list.get(2) + list.get(4) * 2 + list.get(5) * 4 + list.get(6) * 8 + list.get(8) * 16 + list.get(9) * 32
                +list.get(10) * 64 + list.get(11) * 128;
    }


    public static void code(int liczba)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        while(lista.size() != 12)
        {
            lista.add(liczba % 2);
            liczba /= 2;
        }
        ArrayList<Integer> C_values = new ArrayList<>();
        C_values.add(lista.get(4));
        C_values.add(lista.get(8));
        C_values.add(lista.get(10));
        C_values.add(lista.get(11));
        show(lista);
        System.out.println(count(lista, C_values));

    }


    public static void main(String[] args) {
        code(3734);
    }
}
