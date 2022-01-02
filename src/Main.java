public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        Osoba Neo = new Osoba("Neo", "Nazwisko", 1);
        student student1 = new student(Neo, Wydzial.WydzialEnum.Informatyka);

        Osoba Trinity = new Osoba("Trinity", "Nazwisko", 2);
        student student2 = new student(Trinity, Wydzial.WydzialEnum.Chemia);

        Osoba Morpheus = new Osoba("Morpheus", "Nazwisko", 3);
        student student3 = new student(Morpheus, Wydzial.WydzialEnum.Ekonomia);

        Osoba Smith = new Osoba("Smith", "Nazwisko", 4);
        student student4 = new student(Smith, Wydzial.WydzialEnum.Fizyka);

        Osoba Architect = new Osoba("Architect", "Nazwisko", 5);
        student student5 = new student(Architect, Wydzial.WydzialEnum.Matematyka);



        ArrayList<student> lStudentow = new ArrayList<student>();
        lStudentow.add(student1);
        lStudentow.add(student2);
        lStudentow.add(student3);
        lStudentow.add(student4);
        lStudentow.add(student5);

        for (student i : lStudentow) {
            System.out.println(i.student());
        }



        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

    }
}
