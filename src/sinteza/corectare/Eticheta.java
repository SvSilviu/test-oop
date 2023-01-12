package sinteza.corectare;

public class Eticheta extends Dreptunghi {

    private String text;

    public Eticheta(Punct punct1, Punct punct2, String text) {
        super(punct1, punct2);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        String text = "Eticheta : " + "Eu sunt forma cu coordonatele : ";
        return text + super.toString();
    }

    @Override
    public Figura duplicare() {
        return new Eticheta(this.getPunct1(), this.getPunct2(), this.text);
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object object) {
        Eticheta eticheta = (Eticheta) object;
        return super.equals(eticheta) && this.text.equals(eticheta.text);
    }

}
