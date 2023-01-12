package exemplu;

import java.util.ArrayList;
import java.util.Objects;

public class DesenGeometric implements FiguraGeometrica {
    private ArrayList<FiguraGeometrica> listaFiguri;

    public DesenGeometric(ArrayList<FiguraGeometrica> listaFiguri) {
        this.listaFiguri = listaFiguri;
    }

    public void adaugaElement(FiguraGeometrica element) {
        listaFiguri.add(element);
    }

    @Override
    public void afisare() {
        for (FiguraGeometrica figura : listaFiguri) {
            figura.afisare();
        }
    }

    @Override
    public void translateaza(int x, int y) {
        for (FiguraGeometrica element : listaFiguri) {
            element.translateaza(x, y);
        }
    }

    @Override
    public FiguraGeometrica duplicare() {
        return null;
    }

    @Override
    public void identitate() {
        System.out.println("Eu sunt o figura geometrica");
    }

    @Override
    public String toString() {
        return "DesenGeometric{" +
                "elemente=" + listaFiguri +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DesenGeometric that))
            return false;
        return Objects.equals(listaFiguri, that.listaFiguri);
    }

}
