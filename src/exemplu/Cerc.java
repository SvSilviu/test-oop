package exemplu;

public class Cerc implements FiguraGeometrica {

    private Punct punctulCercului;
    private int raza;

    public Cerc(Punct punctulCercului, int raza) {
        this.punctulCercului = punctulCercului;
        this.raza = raza;
    }

    public Punct getPunctulCercului() {
        return punctulCercului;
    }

    public void setPunctulCercului(Punct punctulCercului) {
        this.punctulCercului = punctulCercului;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public void afisare() {
        System.out.println("Cerc: centrul " + punctulCercului.toString() + " si raza " + raza);
    }

    @Override
    public void translateaza(int x, int y) {
        punctulCercului.translateaza(x, y);
    }

    @Override
    public FiguraGeometrica duplicare() {
        return new Cerc(this.punctulCercului, this.raza);
    }

    @Override
    public void identitate() {
        System.out.println("Eu sunt un cerc");
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "centru=" + punctulCercului +
                ", raza=" + raza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cerc)) return false;
        Cerc cerc = (Cerc) o;
        return raza == cerc.raza && punctulCercului.equals(cerc.punctulCercului);
    }

}

