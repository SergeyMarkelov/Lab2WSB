public class Osoba {
    private String imie, nazwisko;
    private int index;

    public Osoba()
    {
        this.imie = "Imie";
        this.nazwisko = "Nazwisko";
        this.index = 0;
    }

    public Osoba(String imie, String nazwisko, int index)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public int getIndex()
    {
        return index;
    }
    @Override
    public String toString() {
        return "" +
                "imie=" + imie +
                ", nazwisko=" + nazwisko +
                ", index=" + index +
                '}';
    }
}
