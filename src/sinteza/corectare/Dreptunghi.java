package sinteza.corectare;

public class Dreptunghi extends Figura {

    private Punct punct1;
    private Punct punct2;

    public Dreptunghi(Punct punct1, Punct punct2) {
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
    public void translate(int a, int b) {
        this.punct1.translate(a, b);
        this.punct2.translate(a, b);
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "punct1=" + punct1 +
                ", punct2=" + punct2 +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Dreptunghi d = (Dreptunghi) object;
        return this.punct1 == d.punct1 && this.punct2 == d.punct2;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public Figura duplicare() {
        return new Dreptunghi(this.punct1, this.punct2);
    }

}
