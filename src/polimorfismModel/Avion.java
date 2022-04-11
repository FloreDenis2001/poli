package polimorfismModel;

public class Avion extends Vehicul {
    private int locuri;

    public Avion(int locuri) {
        super("Avion", 2009);
        this.locuri = locuri;
    }

    public int getLocuri() {
        return locuri;
    }

    public void setLocuri(int locuri) {
        this.locuri = locuri;
    }

    public String descriere() {
        String text = super.descriere();
        text += "Locuri : " + this.locuri + "\n";
        return text;
    }

    @Override
    public String toString() {
        String text = super.descriere();
        text += "Locuri : " + this.locuri + "\n";
        return text;
    }
//    @Override
//    public  boolean equals(Object o){
//        return  this.locuri==((Avion)o).locuri;
//
//    }

}
