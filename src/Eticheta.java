public class Eticheta extends Dreptunghi {

    public Eticheta(String forma, String element) {
        super(forma, element);

    }

    public String afisareEticheta() {
        String text = "";
        text += super.afisareDreptunghi() + "Eu sunt eticheta si ma aflu in interiorul dreptunghiului";
        return text;
    }
}