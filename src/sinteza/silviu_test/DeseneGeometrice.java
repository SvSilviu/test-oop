package sinteza.silviu_test;

public class DeseneGeometrice {

    private String patrat = "";

    public DeseneGeometrice() {

    }

    public String getPatrat() {
        return patrat;
    }

    public void setPatrat(String patrat) {
        this.patrat = patrat;
    }

    public DeseneGeometrice(String patrat) {
        this.patrat = patrat;

    }

    public String afisare() {
        String text = "";
        text += "Forma geomatrica = patrat " + patrat + "\n";
        return text;
    }
}
