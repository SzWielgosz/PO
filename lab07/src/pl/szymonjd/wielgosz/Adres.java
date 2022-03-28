package pl.szymonjd.wielgosz;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String miasto;
    private String kod_pocztowy;
    public Adres(String ulica, String numerDomu, String miasto, String kodPocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numerDomu;
        this.miasto = miasto;
        this.kod_pocztowy = kodPocztowy;
    }
    public Adres(String ulica, String miasto, String kodPocztowy)
    {
        this.ulica = ulica;
        this.miasto = miasto;
        this.kod_pocztowy = kodPocztowy;
    }
    public void pokaz()
    {
        if(this.numer_domu == null)
        {
            System.out.println(this.kod_pocztowy + " " + this.miasto);
            System.out.println(this.ulica);
        }
        else
        {
            System.out.println(this.kod_pocztowy + " " + this.miasto);
            System.out.println(this.ulica + " " + this.numer_domu);
        }
    }
    public boolean przed(Adres adres)
    {
        String x = adres.kod_pocztowy;
        String y = this.kod_pocztowy;
        x = x.replace("-", "");
        y = y.replace("-", "");

        int m = Integer.parseInt(x);
        int n = Integer.parseInt(y);
        return m < n;
    }
}
