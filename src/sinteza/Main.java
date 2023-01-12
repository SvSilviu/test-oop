package sinteza;

import sinteza.corectare.*;

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

        String text = "Eu sunt eticheta";
        Punct punct1 = new Punct(x, y);
        Punct punct2 = new Punct(x,y);
        Punct punctLinie = new Punct(x,y);
        Punct punctLinie2 = new Punct(x,y);
        Punct punctCerc = new Punct(x,y);
        Punct punctDreptunghi = new Punct(x,y);
        Punct punctDreptunghi2 = new Punct(x,y);




        Linie linie = new Linie(punctLinie,punctLinie2);
        Dreptunghi dreptunghi = new Dreptunghi(punctDreptunghi,punctDreptunghi2);
        Cerc cerc = new Cerc(punctCerc,linie);
        Eticheta eticheta = new Eticheta(punctDreptunghi,punctDreptunghi2,text);

        dreptunghi.afisare();
        punct1.afisare();
        linie.afisare();
        cerc.afisare();
        eticheta.afisare();


    }
}