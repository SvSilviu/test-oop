public class Linie extends DeseneGeometrice {
    String element = "";

    public Linie(String forma, String element) {
        super(forma);
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String afisareLinie() {
        String text = "";
        text += super.afisare() + "Linia este definita de 2 puncte";
        return text;
    }
}
