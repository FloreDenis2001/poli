package ex1;

import java.util.ArrayList;

public class Desen {

    private ArrayList<Figura> figuras;

    public Desen(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public void translate(int unitati) {
        for (Figura e : figuras) {

            e.translate(unitati);
        }
    }

    public void duplicarea(Figura f) {
        for (Figura x : figuras) {
            x.duplicare(f);
        }
    }

    public void afisare() {
        for (Figura x : figuras) {
            x.afisare();
        }
    }


}
