package sinteza.corectare;

import java.util.ArrayList;
public class Desen extends Figura {

    private ArrayList<Figura> figuri;

    public Desen(ArrayList<Figura> figuri) {
        this.figuri = figuri;
    }
    @Override
    public void afisare() {

        for (Figura f : figuri) {
            f.afisare();
        }
    }
    @Override
    public void translate(int a, int b) {

        for (Figura f : figuri) {
            f.translate(a, b);
        }
    }
    @Override
    public Figura duplicare() {
        return  new Desen(figuri);
    }
}