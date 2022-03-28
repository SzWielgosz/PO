import java.util.*;

public class Main{
    public static <T> void redukuj(LinkedList<T>pracownicy, int n)
    {
        for(int i = n - 1; i < pracownicy.size(); i += n - 1)
        {
            pracownicy.remove(i);
        }
    }

    public static<T> void odwroc(LinkedList<T> lista)
    {
        for(int i = 0, j = lista.size() - 1; i < j; i++, j--)
        {
            T tmp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, tmp);
        }
    }

    public static void odwrocStos(String zdanie) {
        Stack<String> stos = new Stack<>();
        String[] wyrazy = zdanie.split(" ");
        int kropki = zdanie.length() - zdanie.replace(".", "").length();
        int i = 0;

        while (kropki != 0) {
            for(; i < wyrazy.length; i++) {
                if (wyrazy[i].contains(".")) {
                    stos.add(wyrazy[i].toLowerCase().replace(".", ""));
                    i++;
                    break;
                }
                stos.add(wyrazy[i].toLowerCase());
            }

            String slowo = stos.pop();
            char znak = slowo.charAt(0);
            znak = Character.toUpperCase(znak);
            slowo = slowo.replace(slowo.charAt(0), znak);
            System.out.print(slowo + " ");

            Iterator<String> iter = stos.iterator();
            while (iter.hasNext()) {
                System.out.print(stos.pop() + " ");
                if (stos.size() == 1) {
                    System.out.print(stos.pop() + ". ");
                }
            }
            kropki--;
        }
    }

    public static void odwrocLiczbe(int liczba)
    {
        Stack<Integer> stos = new Stack<>();
        while(liczba != 0)
        {
            stos.add(liczba % 10);
            liczba = liczba / 10;
        }
        Iterator<Integer> iter = stos.iterator();
        while(iter.hasNext())
        {
            System.out.print(stos.pop() + " ");
        }
    }

    public static void sitoErastotenesa(int n)
    {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for(int i = 2; i < Math.sqrt(primes.length); i++)
        {
            for(int j = i * i; j < primes.length; j += i)
            {
                if(primes[j])
                {
                    primes[j] = false;
                }
            }
        }

        for(int i = 0; i < primes.length; i++)
        {
            if(primes[i])
            {
                System.out.print(i + " ");
            }
        }
    }

    public static<T extends Iterable> void print(T cos)
    {
        Iterator<T> iter = cos.iterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next() + ", ");
        }
    }

    public static void main(String[] args)
    {

        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        liczby.add(5);
        liczby.add(6);

        System.out.println(liczby);
        odwroc(liczby);
        System.out.println(liczby);


        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Janusz");
        pracownicy.add("Andrzej");
        pracownicy.add("Marek");
        pracownicy.add("Franek");
        pracownicy.add("Arnold");
        pracownicy.add("Grzegorz");
        pracownicy.add("Jakub");
        pracownicy.add("Miroslaw");

        System.out.println(pracownicy);
        redukuj(pracownicy, 3);
        System.out.println(pracownicy);

        String zdanie = "Ala ma kota. Jej kot lubi myszy.";
        odwrocStos(zdanie);
        System.out.println();

        odwrocLiczbe(2015);
        System.out.println();

        sitoErastotenesa(100);
        System.out.println();

        print(liczby);
    }
}
