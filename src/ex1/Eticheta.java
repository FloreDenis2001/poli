package ex1;

public class Eticheta extends Dreptunghi{
    private String textInterior;

    public Eticheta(Punct punctD1, Punct punctD2, String textInterior) {
        super(punctD1, punctD2);
        this.textInterior = textInterior;
    }

    public String getTextInterior() {
        return textInterior;
    }

    public void setTextInterior(String textInterior) {
        this.textInterior = textInterior;
    }
    @Override
    public String toString(){
        String text=super.toString()+"\n";
        text+="Text: "+this.textInterior+"\n";
        return text;
    }
}
