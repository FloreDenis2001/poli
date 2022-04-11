package ex1;

public class Cerc extends Figura {
    private Punct punct;
    private int raza;

    public Cerc(Punct punct, int raza) {
        this.punct = punct;
        this.raza = raza;
    }

    public Punct getPunct() {
        return punct;
    }

    public void setPunct(Punct punct) {
        this.punct = punct;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }



    @Override
    public void translate(int unitati) {
        this.punct.tranlslate(unitati);
    }

    @Override
    public String toString() {
        String text = "Punct :(" + this.punct.getX() + " , " + this.punct.getY() + ")" + "\n";
        text += "Raza : " + this.raza + "\n";
        return text;
    }

    @Override
    public void duplicare(Figura figura) {
        Cerc cerc=(Cerc) figura;
        this.punct=((Cerc) figura).punct;
        this.raza=((Cerc) figura).raza;

    }


    @Override
    public void afisare(){
        System.out.println("-Cerc-");
    }
}
