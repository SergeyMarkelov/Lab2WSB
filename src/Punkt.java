import jdk.incubator.vector.VectorOperators;

/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */
    private int pX, pY, pZ;


    public Punkt(){};
    public Punkt(int pX){
        this.pX = pX;
    }
    public Punkt(int pX, int pY, int pZ) {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    public int getpX() {
        return pX;
    }

    public int getpY() {
        return pY;
    }

    public int getpZ() {
        return pZ=pZ*10;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }
    public void setpY(int pY) {
        this.pY = pY;
    }
    public void setpZ(int pZ) {
        this.pZ = pZ;
    }

    Punkt Test = new Punkt (1,2,3);

    public static int Suma (int pX, int pY, int pZ) {
        int Suma = pX + pY + pZ;
        return Suma;
    }

        public static int Roznica (int pX, int pY, int pZ) {
            int Roznica = pX - pY - pZ;
            return Roznica;
        }

            public static int Roznica2 (int x, int p, int z) {
                int Roznica2 = (this.pX * x) - (this.pY * y) - (this.pZ * z);
                return Roznica2;
    }


   /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;


        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
}
