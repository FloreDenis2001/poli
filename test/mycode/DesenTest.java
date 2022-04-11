package mycode;

import ex1.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DesenTest {

    @Test
    public void DreptunghiTest(){
        ArrayList<Figura> figuras=new ArrayList<>();

        figuras.add(new Dreptunghi(new Punct(5,4),new Punct(3,5)));
        figuras.add(new Dreptunghi(new Punct(2,3),new Punct(1,7)));
        figuras.add(new Dreptunghi(new Punct(8,4),new Punct(2,5)));
        figuras.add(new Linie(new Punct(2,4),new Punct(4,5)));
        figuras.add(new Linie(new Punct(9,5),new Punct(4,7)));
        figuras.add(new Cerc(new Punct(9,5),5));
        figuras.add(new Cerc(new Punct(2,5),7));

        Desen desen = new Desen(figuras);

        desen.afisare();
    }

}