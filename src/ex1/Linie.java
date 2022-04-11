package ex1;

public class Linie extends Figura {

    private Punct punct1;
    private Punct punct2;

    public Linie(Punct punct1, Punct punct2) {
        this.punct1 = punct1;
        this.punct2 = punct2;
    }

    public Punct getPunct1() {
        return punct1;
    }

    public void setPunct1(Punct punct1) {
        this.punct1 = punct1;
    }

    public Punct getPunct2() {
        return punct2;
    }

    public void setPunct2(Punct punct2) {
        this.punct2 = punct2;
    }

    @Override
    public void translate(int unitati) {
        punct1.tranlslate(unitati);
        punct2.tranlslate(unitati);
    }

    @Override
    public String toString() {
        String text = "Punct 1 :(" + this.punct1.getX() + " , " + this.punct1.getY() + ")" + "\n";
        text += "Punct 2: " + this.punct2.getX() + " , " + this.punct2.getY() + ")" + "\n";
        return text;
    }

    @Override
    public void duplicare(Figura figura) {

       Linie linie=(Linie) figura;

        this.punct1=((Linie) figura).punct1;
        this.punct2=((Linie) figura).punct2;

    }


    @Override
    public void afisare(){
        System.out.println("-Linie-");
    }
}
