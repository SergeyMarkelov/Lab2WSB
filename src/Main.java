import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */
        enum LiczbyEnum {Jeden, Dwa, Trzy, Cztery, Piec, Szesc}
        enum StatusEnum {KONTYNUUJEMY, KONIEC}
        Scanner forLoop = new Scanner(System.in);
        boolean variableforloop = false;
        while (variableforloop = true) {
            switch (forLoop.nextInt()) {
                case 1:
                    System.out.println(LiczbyEnum.Jeden);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 2:
                    System.out.println(LiczbyEnum.Dwa);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;

                case 3:
                    System.out.println(LiczbyEnum.Trzy);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;

                case 4:
                    System.out.println(LiczbyEnum.Cztery);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 5:
                    System.out.println(LiczbyEnum.Piec);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 6:
                    System.out.println(LiczbyEnum.Szesc);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 0:
                    System.out.println(StatusEnum.KONIEC);
                    variableforloop = true;
                    return;

            }
        }
    }
}



