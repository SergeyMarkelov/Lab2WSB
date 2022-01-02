import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Punkt punktA = new Punkt(2);
        punktA.toString();
        System.out.println(punktA.toString());

        Punkt punkt = new Punkt(1,2,3);
        punktA.toString();
        System.out.println(punktA.toString());

        punktA.setpX(4);
        punktA.toString();
        System.out.println(punktA.toString());

        System.out.printf("pX = %d \n", punktA.getpX());
        System.out.printf("x = %d , y = %d , pX = %d\n", punkt.getX(), punkt.getY(), punkt.getpX());
        System.out.println("Suma punktuA: " + punktA.sumaP());
        System.out.println("Suma punktu: " + punkt.suma());
        System.out.println("Roznica punktuA: " + punktA.roznicaP();
        System.out.println("Roznica punktu: " + punkt.roznica();




        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

    }
}
