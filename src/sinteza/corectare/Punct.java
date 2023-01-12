package sinteza.corectare;

public class Punct extends Figura {

    private int x;
    private int y;

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
    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "x = " + x + " si " + "y = " + y;
    }

    @Override
    public boolean equals(Object object) {
        Punct p = (Punct) object;
        return this.x == p.x && this.y == p.y;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }


    @Override
    public Figura duplicare() {
        return new Punct(this.x, this.y);
    }

}
