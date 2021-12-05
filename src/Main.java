import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student student1 = new Student();
        student1.imie = "Adam";
        student1.man = true;

        Student student2 = new Student();
        student2.imie = "Ewa";
        student2.man = false;

        Student student3 = new Student();
        student3.imie = "Snake";
        student3.man = true;

       /* Student[] ArrayForObjects;
        ArrayForObjects = new Student[3];
        ArrayForObjects[0] = student1;
        ArrayForObjects[1] = student2;
        ArrayForObjects[2] = student3;*/

       Student[] ArrayforObjects = new Student[] {student1, student2, student3};
       for (int i = 0; i < 3; ++i) {
           System.out.println(ArrayforObjects[i]);

           //System.out.println(Arrays.deepToString(ArrayForObjects));
       }
    }



}
