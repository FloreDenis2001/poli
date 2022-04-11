package ex1;

public class Punct {

    private int x;
    private int y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void translateX(int unitati){
        this.setX(x+unitati);
    }
    public void translateY(int unitati){
        this.setX(y+unitati);
    }

    public void tranlslate(int unitati){
        this.translateX(unitati);
        this.translateY(unitati);
    }


    @Override
    public String toString() {
        String text = "x = " + this.x + "\n";
        text += "y= " + this.y + "\n";
        return text;
    }
}
