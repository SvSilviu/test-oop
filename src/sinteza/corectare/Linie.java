package sinteza.corectare;

public class Linie extends Figura {

    private Punct punct1;
    private Punct punct2;

    public Linie(Punct punct1, Punct punct2) {
        this.punct1 = punct1;
        this.punct2 = punct2;
    }

    public Punct getPunct2() {
        return punct2;
    }

    public void setPunct2(Punct punct2) {
        this.punct2 = punct2;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public void translate(int a, int b) {
        this.punct1.translate(a, b);
        this.punct2.translate(a, b);
    }

    @Override
    public String toString() {
        return "Linie : " + punct1 + " " + punct2;
    }

    @Override
    public Figura duplicare() {
        return new Linie(this.punct1, this.punct2);

    }

    @Override
    public boolean equals(Object object) {
        Linie l = (Linie) object;
        return this.punct1.equals(l.punct1) || this.punct1.equals(l.punct2)
                &&
                this.punct2.equals(l.punct2) || this.punct2.equals(l.punct1);
    }


}
