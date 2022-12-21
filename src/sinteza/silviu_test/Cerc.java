package sinteza.silviu_test;

public class Cerc extends DeseneGeometrice {

    String element="";

    public Cerc(String patrat,String element) {
        super(patrat);
        this.element=element;
    }

    public Cerc() {

    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String afisareCerc(){
        String text ="";
        text+=super.afisare()+"Elementele cercului sunt un punct si raza";
        return text;
    }

}
