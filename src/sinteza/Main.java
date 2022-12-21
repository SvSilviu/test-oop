package sinteza;

import sinteza.corectare.Figura;
import sinteza.corectare.Punct;

public class Main {
    public static void main(String[] args) {

//DeseneGeometrice deseneGeometrice = new DeseneGeometrice();
//Punct punct = new Punct();
//Linie linie = new Linie();
//Cerc cerc = new Cerc();
//Dreptunghi dreptunghi = new Dreptunghi();
//Eticheta eticheta = new Eticheta();
//
//
//
//        System.out.println(deseneGeometrice.afisare());
//        System.out.println(punct.afisarePunct());
//        System.out.println(linie.afisareLinie());
//        System.out.println(cerc.afisareCerc());
//        System.out.println(dreptunghi.afisareDreptunghi());
//        System.out.println(eticheta.afisareEticheta());

        int x = 3, y = 5;

        Figura punct1 = new Punct(x, y);


//        punct1.afisare();
//        punct1.translate(x, y);
//        System.out.println(punct1.duplicare());
//        System.out.println(punct1.equals(punct1));

        Figura dreptunghi = new Punct(x, y);

        dreptunghi.afisare();
        dreptunghi.translate(x,y);
        System.out.println(dreptunghi.duplicare());
        System.out.println(dreptunghi.equals(punct1));


    }
}