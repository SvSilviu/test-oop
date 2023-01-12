package exemplu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class FiguraGeometricaTest {

    @Test
    public void testare() {
        int x = 1, y = 2;
        int raza = 2;
        String text = null;
        Punct p1 = new Punct(0, 0);
        Punct p2 = new Punct(5, 5);
        Punct punctDreptunghi1 = new Punct(1, 3);
        Punct punctDreptunghi2 = new Punct(2, 4);
        Punct punctEticheta1 = new Punct(4, 2);
        Punct punctEticheta2 = new Punct(3, 2);
        Punct punctulCercului = new Punct(5, 1);

        FiguraSilviu figuraSilviu= new FiguraSilviu();

        Linie linie = new Linie(p1, p2);
        Cerc cerc = new Cerc(punctulCercului, raza);
        Dreptunghi dreptunghi = new Dreptunghi(punctDreptunghi1, punctDreptunghi2);
        Eticheta eticheta = new Eticheta(punctEticheta1, punctEticheta2, text);

        ArrayList<FiguraGeometrica> listaFiguri = new ArrayList<>();

        listaFiguri.add(linie);
        listaFiguri.add(cerc);
        listaFiguri.add(dreptunghi);
        listaFiguri.add(eticheta);
        listaFiguri.add(figuraSilviu);

        DesenGeometric desen = new DesenGeometric(listaFiguri);

        desen.afisare();
        desen.translateaza(x, y);
        System.out.println("==========================");
        desen.afisare();
        desen.duplicare();
    }

}