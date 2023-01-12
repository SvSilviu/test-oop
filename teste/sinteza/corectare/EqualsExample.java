package sinteza.corectare;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class EqualsExample {

    @Test
    public void testNou() {


        int x = 0;
        int y = 1;

        Punct punct = new Punct(2, 3);
        Punct punct2 = new Punct(1, 1);
        Punct punct3 = new Punct(-1,4);
        Punct punct4 = new Punct(-1,4);


        ArrayList<Figura> figuri = new ArrayList<>();


        figuri.add(punct);
        figuri.add(punct2);
        figuri.add(punct3);

        System.out.println(figuri.contains(punct4));

    }

}
