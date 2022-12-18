public class Dreptunghi extends DeseneGeometrice {

    String element = "";

    public Dreptunghi(String forma, String element) {
        super(forma);
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String afisareDreptunghi() {
        String text = "";
        text += super.afisare() + "Dreptunghiul este definita de 2 puncte";
        return text;
    }
}
