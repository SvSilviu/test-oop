package exemplu;

public class Punct implements FiguraGeometrica {
    private int x, y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void afisare() {
        System.out.println("Punct: " + x + ", " + y);
    }

    @Override
    public void translateaza(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public FiguraGeometrica duplicare() {
        return new Punct(this.x, this.y);
    }

    @Override
    public void identitate() {
        System.out.println("Eu sunt un punct");
    }

    @Override
    public String toString() {
        return "Punct{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Punct punct = (Punct) object;
        return this.x == punct.x && this.y == punct.y;
    }
}

