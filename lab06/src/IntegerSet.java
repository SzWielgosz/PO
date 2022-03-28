public class IntegerSet {
    private boolean[] zbior;
    public IntegerSet() {
    this.zbior = new boolean[100];
}
    public static IntegerSet union(IntegerSet a, IntegerSet b)
    {
        IntegerSet wynik = new IntegerSet();
        for(int i = 0; i < 100; i++)
        {
            if(a.zbior[i] == true || b.zbior[i] == true)
            {
                wynik.zbior[i] = true;
            }
        }
        return wynik;
    }
    public static IntegerSet intersection(IntegerSet a, IntegerSet b)
    {
        IntegerSet wynik = new IntegerSet();
        for(int i = 0; i < 100; i++)
        {
            if(a.zbior[i] == true && b.zbior[i] == true)
            {
                wynik.zbior[i] = true;
            }
        }
        return wynik;
    }
    public void insertElement(int x)
    {
        this.zbior[x - 1] = true;
    }
    public void deleteElement(int x)
    {
        this.zbior[x - 1] = false;
    }
    public String toString()
    {
        StringBuilder wynik = new StringBuilder();
        for(int i = 0; i < 100; i++)
        {
            if(this.zbior[i] == true)
            {
                wynik.append(i + 1);
                wynik.append(" ");
            }
        }
        return wynik.toString();
    }
    public boolean equals(IntegerSet a)
    {
        if(a.toString().equals(this.toString()))
        {
            return true;
        }
        return false;
    }
//Zrobilem dwie metody equals, jedna sprawdza czy oba stringi sa takie same, a druga przechodzi po elementach zbioru
//i sprawdza czy wartosci obu zbiorow sa takie same
    public boolean equals2(IntegerSet a)
    {
        for(int i = 0; i < 100; i++)
        {
            if(this.zbior[i] != a.zbior[i])
            {
                return false;
            }
        }
        return true;
    }

}

