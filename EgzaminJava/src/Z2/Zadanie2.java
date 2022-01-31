package Z2;
import java.util.*;

public class Zadanie2 {
    public static<E extends Iterable<?>> void printMarginal(E obiekt)
    {
        Iterator<?> iterator = obiekt.iterator();
        System.out.print(iterator.next() + " ");
        int x = 0;
        while(iterator.hasNext())
        {
            x += 1;
            iterator.next();
        }
        Iterator<?> iterator1 = obiekt.iterator();
        while(x != 0)
        {
            iterator1.next();
            x -= 1;
        }
        System.out.print(iterator1.next() + " ");
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(1);
        lista.add(10);
        lista.add(7);
        lista.add(5);

        LinkedList<Integer> linkedLista = new LinkedList<>();
        linkedLista.add(1);
        linkedLista.add(5);
        linkedLista.add(10);

        Stack<String> stos = new Stack<>();
        stos.push("Witam");
        stos.push("Serdecznie");
        stos.push("Wszystkich");

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);


        System.out.print("ArrayLista: ");
        printMarginal(lista);
        System.out.print("Linked lista: ");
        printMarginal(linkedLista);
        System.out.print("Stos: ");
        printMarginal(stos);
        System.out.print("Vector: ");
        printMarginal(vector);
    }
}
