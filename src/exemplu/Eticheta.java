package exemplu;

public class Eticheta implements FiguraGeometrica {
    private Punct punctEticheta1, punctEticheta2;
    private String text;

    public Eticheta(Punct punctEticheta1, Punct punctEticheta2, String text) {
        this.punctEticheta1 = punctEticheta1;
        this.punctEticheta2 = punctEticheta2;
        this.text = text;
    }


    @Override
    public void afisare() {
        System.out.println("Eticheta: dreptunghi " + punctEticheta1.toString() + " si " + punctEticheta2.toString() + " si text " + text);
    }

    @Override
    public void translateaza(int x, int y) {
        punctEticheta1.translateaza(x, y);
        punctEticheta2.translateaza(x, y);
    }

    @Override
    public FiguraGeometrica duplicare() {
        return new Eticheta(this.punctEticheta1, this.punctEticheta2, this.text);
    }

    @Override
    public void identitate() {
        System.out.println("Eu sunt o eticheta");
    }

    @Override
    public String toString() {
        return "Eticheta: dreptunghi " + punctEticheta1.toString() + " si " + punctEticheta2.toString() + " si text " + text;
    }

    @Override
    public boolean equals(Object object) {
        Eticheta eticheta = (Eticheta) object;
        return super.equals(eticheta) && this.text.equals(eticheta.text);
    }
}


