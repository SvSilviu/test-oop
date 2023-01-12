package sinteza.corectare;

public class Figura {


    public void afisare() {

        System.out.println("Eu sunt o figura");
    }

    public void translate(int x, int y) {

        System.out.println("Eu sunt o translatare cu " + x + " " + y);
    }

    public Figura duplicare() {

        System.out.println("Duplicare");

        return null;
    }
}
