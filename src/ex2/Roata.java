package ex2;

public class Roata {
    private int dimensiune;
    private String color;

    public Roata(int dimensiune, String color) {
        this.dimensiune = dimensiune;
        this.color = color;
    }

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString(){
        String text ="Dimensiune : "+this.dimensiune+"\n";
        text+="Culoare = "+this.color+"\n";
        return text;
    }
}
