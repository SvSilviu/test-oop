package exemplu;

public class Linie implements FiguraGeometrica {
    private Punct punct1, punct2;

    public Linie(Punct punct1, Punct punct2) {
        this.punct1 = punct1;
        this.punct2 = punct2;
    }

    public Punct getPunct1() {
        return punct1;
    }

    public void setPunct1(Punct punct1) {
        this.punct1 = punct1;
    }

    public Punct getPunct2() {
        return punct2;
    }

    public void setPunct2(Punct punct2) {
        this.punct2 = punct2;
    }

    @Override
    public void afisare() {
        System.out.println("Linie: " + punct1.toString() + " - " + punct2.toString());
    }

    @Override
    public void translateaza(int x, int y) {
        punct1.translateaza(x, y);
        punct2.translateaza(x, y);
    }

    @Override
    public FiguraGeometrica duplicare() {
        return new Linie(this.punct1, this.punct2);
    }

    @Override
    public void identitate() {
        System.out.println("Eu sunt o linie");
    }

    @Override
    public String toString() {
        return "Linie{" +
                "punct1=" + punct1 +
                ", punct2=" + punct2 +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Linie linie = (Linie) object;
        return this.punct1.equals(linie.punct1) || this.punct1.equals(linie.punct2)
                &&
                this.punct2.equals(linie.punct2) || this.punct2.equals(linie.punct1);
    }
}
