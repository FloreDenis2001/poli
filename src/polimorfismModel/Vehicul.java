package polimorfismModel;

public class Vehicul {
    private String tip;
    private int anul;

    public Vehicul(String tip, int anul) {
        this.tip = tip;
        this.anul = anul;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getAnul() {
        return anul;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }


    public String descriere() {
        String text = "Tip : " + this.tip + "\n";
        text += "Anul : " + this.anul + "\n";
        return text;
    }


}
