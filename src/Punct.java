public class Punct extends DeseneGeometrice {

    int x = 0;
    int y = 0;

    public Punct(String forma, int x, int y) {
        super(forma);
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

    public String afisarePunct() {
        String text = "";
        text += super.afisare() + "Punct este definit de coordonatele x,y";
        return text;
    }

}
