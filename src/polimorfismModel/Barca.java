package polimorfismModel;

public class Barca extends Vehicul {
    private String color;

    public Barca(String color) {
        super("Barca", 2019);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String descriereBarca() {
        String text = super.descriere();
        text += "Culoare : " + this.color + "\n";
        return text;
    }
}
