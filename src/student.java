public class student {




    Osoba osoba;
    Wydzial.WydzialEnum wydzial;

    public student() {
        this.osoba = new Osoba();
    }
    public student(Osoba osoba, Wydzial.WydzialEnum Wydzl) {
        this.osoba = osoba;
        this.wydzial = Wydzl;
    }
    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public void setWydzial(Wydzial.WydzialEnum Wydzl) {
        this.wydzial = Wydzl;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public Wydzial.WydzialEnum getWydzial() {
        return wydzial;
    }

    @Override
    public String toString()
    {
        return "Dane studenta: {"
                + osoba +
                ", Wydzial=" + wydzial +
                '}';

    }


}
