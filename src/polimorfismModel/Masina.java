package polimorfismModel;

public class Masina extends Vehicul {
    private int hp;

    public Masina(int hp) {
        super("Masina", 2016);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String descriere(){
        String text = super.descriere();
        text+="Cai putere: "+this.hp+"\n";
        return text;
    }
}
