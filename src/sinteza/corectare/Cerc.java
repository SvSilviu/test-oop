package sinteza.corectare;

public class Cerc extends Figura {

    private Punct punct;
    private Linie linie;

    public Cerc(Punct punct2, Linie linie) {
        this.punct = punct2;
        this.linie = linie;
    }

    public Punct getPunct() {
        return punct;
    }

    public void setPunct(Punct punct) {
        this.punct = punct;
    }

    public Linie getLinie() {
        return linie;
    }

    public void setLinie(Linie linie) {
        this.linie = linie;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object object) {
        Cerc cerc = (Cerc) object;
        return this.punct.equals(cerc.getPunct()) && this.linie.equals(cerc.getLinie());
    }

    @Override
    public String toString() {
        return "Cerc : " + this.punct + " " + this.linie;
    }

    @Override
    public Figura duplicare() {
        return new Cerc(this.punct, this.linie);
    }

    @Override
    public void translate(int a, int b) {
        this.punct.translate(a, b);
        this.linie.translate(a, b);
    }
}
