package ex1;

public class Dreptunghi extends Figura{
    private Punct punctD1;
    private Punct punctD2;

    public Dreptunghi(Punct punctD1, Punct punctD2) {
        this.punctD1 = punctD1;
        this.punctD2 = punctD2;
    }

    public Punct getPunctD1() {
        return punctD1;
    }

    public void setPunctD1(Punct punctD1) {
        this.punctD1 = punctD1;
    }

    public Punct getPunctD2() {
        return punctD2;
    }

    public void setPunctD2(Punct punctD2) {
        this.punctD2 = punctD2;
    }

    @Override
    public String toString() {
        String text = "Punct 1 :(" + this.punctD1.getX() + " , " + this.punctD1.getY() + ")" + "\n";
        text += "Punct 2: " + this.punctD2.getX() + " , " + this.punctD2.getY() + ")" + "\n";
        return text;
    }


    @Override
    public void translate(int unitati){
        this.punctD1.tranlslate(unitati);
        this.punctD2.tranlslate(unitati);
    }

    @Override
    public void duplicare(Figura figura) {

        Dreptunghi dreptunghi=(Dreptunghi) figura;

        this.punctD1=((Dreptunghi) figura).punctD1;
        this.punctD2=((Dreptunghi) figura).punctD2;

    }

    @Override
    public void afisare(){
        System.out.println("-Dreptunghi-");
    }
}
