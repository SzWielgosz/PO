import java.util.HashMap;

public class Test {

    public static void telefon(String zdanie)
    {
        HashMap<Character, Integer> mapa = new HashMap<>();
        mapa.put('A', 2);
        mapa.put('B', 22);
        mapa.put('C', 222);
        mapa.put('D', 3);
        mapa.put('E', 33);
        mapa.put('F', 333);
        mapa.put('G', 4);
        mapa.put('H', 44);
        mapa.put('I', 444);
        mapa.put('J', 5);
        mapa.put('K', 55);
        mapa.put('L', 555);
        mapa.put('M', 6);
        mapa.put('N', 66);
        mapa.put('O', 666);
        mapa.put('P', 7);
        mapa.put('Q', 77);
        mapa.put('R', 777);
        mapa.put('S', 7777);
        mapa.put('T', 8);
        mapa.put('U', 88);
        mapa.put('V', 888);
        mapa.put('W', 9);
        mapa.put('X', 99);
        mapa.put('Y', 999);
        mapa.put('Z', 9999);
        mapa.put(' ', 0);

        for(int i = 0; i < zdanie.length(); i++)
        {
            System.out.print(mapa.get(zdanie.charAt(i)));
        }
    }

    public static void main(String[] args)
    {
        //Odwrocenie stringa bez stringbuildera
//        String zdanie = "Ala ma kota";
//        String reverse = "";
//        for(int i = zdanie.length() - 1; i >= 0; i--)
//        {
//            reverse += zdanie.charAt(i);
//        }
//        System.out.println(reverse);

        //Tekst z telefonu na przyciski
        String zdanie = "KOT";
        telefon(zdanie);




    }
}
