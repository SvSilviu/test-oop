package exemplu;

public class Dreptunghi implements FiguraGeometrica {
    private Punct punctulDreptunghului1, punctulDreptunghiului2;

    public Dreptunghi(Punct punctulDreptunghului1, Punct punctulDreptunghiului2) {
        this.punctulDreptunghului1 = punctulDreptunghului1;
        this.punctulDreptunghiului2 = punctulDreptunghiului2;
    }

    @Override
    public void afisare() {
        System.out.println("Dreptunghi: colturi " + punctulDreptunghului1.toString() + " si " + punctulDreptunghiului2.toString());
    }

    @Override
    public void translateaza(int x, int y) {
        punctulDreptunghului1.translateaza(x, y);
        punctulDreptunghiului2.translateaza(x, y);
    }

    @Override
    public FiguraGeometrica duplicare() {
        return new Dreptunghi(this.punctulDreptunghului1, this.punctulDreptunghiului2);
    }

    @Override
    public void identitate() {
        System.out.println("Eu sunt un dreptunghi");
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "colt1=" + punctulDreptunghului1 +
                ", colt2=" + punctulDreptunghiului2 +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Dreptunghi dreptunghi = (Dreptunghi) object;
        return this.punctulDreptunghului1.equals(dreptunghi.punctulDreptunghului1) || this.punctulDreptunghului1.equals(dreptunghi.punctulDreptunghiului2)
                &&
                this.punctulDreptunghiului2.equals(dreptunghi.punctulDreptunghiului2) || this.punctulDreptunghiului2.equals(dreptunghi.punctulDreptunghului1);
    }
}


