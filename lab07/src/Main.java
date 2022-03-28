import pl.szymonjd.wielgosz.*;

public class Main {
    public static void main(String[] args)
    {
        Adres adres = new Adres("Bukowa", "10", "Warszawa", "11-200");
        adres.pokaz();
        System.out.println("-----------------");

        Nauczyciel belfer = new Nauczyciel("Kowalski", 1994, 4500);
        System.out.println(belfer.getNazwisko());
        System.out.println(belfer.getRokUrodzenia());
        System.out.println(belfer.getPensja());
        System.out.println(belfer);
        System.out.println("------------------");

        Osoba Janek = new Osoba("Brzeczyszczykiewicz", 1936);
        System.out.println(Janek);
        System.out.println("------------------");

        Student pierwszak = new Student("Wojcik", 2002, "Lekarski");
        System.out.println(pierwszak);
        System.out.println(pierwszak.getKierunek());
        System.out.println("------------------");

        BetterRectangle prostokat = new BetterRectangle(1, 2, 5, 10);
        System.out.println(prostokat.getWidth());
        System.out.println(prostokat.getLocation());
        System.out.println(prostokat.getArea());
        System.out.println(prostokat.getPerimeter());
        System.out.println("------------------");

        Adres adres1 = new Adres("Wolnosci", "Ketrzyn", "11-400");
        Adres adres2 = new Adres("WojskaPolskiego", "Krakow", "04-280");
        System.out.println(adres1.przed(adres2));
    }
}
