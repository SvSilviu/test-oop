package sinteza.corectare;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class DesenTest {

    @Test
    public void testDesen() {

        int x = 1, y = 2;
        String text = null;

        Punct punctLinie = new Punct(1, 2);
        Punct punctLinie2 = new Punct(3, 4);
        Punct punctCerc = new Punct(5, 6);
        Punct punctDreptunghi = new Punct(1, 1);
        Punct punctDreptunghi2 = new Punct(3, -3);
        Punct punctEticheta = new Punct(4, 2);
        Punct punctEticheta2 = new Punct(3, 5);
        Punct p1 = new Punct(7, 1);
        Punct p2 = new Punct(3, 2);


        Linie linie = new Linie(punctLinie, punctLinie2);
        Linie linieCerc = new Linie(p1, p2);
        Cerc cerc = new Cerc(punctCerc, linieCerc);
        Dreptunghi dreptunghi = new Dreptunghi(punctDreptunghi, punctDreptunghi2);
        Eticheta eticheta = new Eticheta(punctEticheta, punctEticheta2, text);

        ArrayList<Figura> figuri = new ArrayList<>();

        figuri.add(linie);
        figuri.add(cerc);
        figuri.add(dreptunghi);
        figuri.add(eticheta);

        Desen desen = new Desen(figuri);

        desen.afisare();
        desen.translate(x, y);
        System.out.println("======================================================================================================");
        desen.afisare();
        desen.duplicare();
    }
}