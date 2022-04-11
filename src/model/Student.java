package model;

public class Student extends Person {
    private int mediaExamene;
    private String specializare;
    private int anulDeStudiu;

    public Student(int mediaExamene,String specializare,int anulDeStudiu){
        super("password1","java@yahoo.com");
        this.mediaExamene=mediaExamene;
        this.specializare=specializare;
        this.anulDeStudiu=anulDeStudiu;
    }

    public int getMediaExamene() {
        return mediaExamene;
    }

    public void setMediaExamene(int mediaExamene) {
        this.mediaExamene = mediaExamene;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public int getAnulDeStudiu() {
        return anulDeStudiu;
    }

    public void setAnulDeStudiu(int anulDeStudiu) {
        this.anulDeStudiu = anulDeStudiu;
    }

    public String descriereStudent(){
        String text=super.descriere();
        text+="Media Examenelor : " +this.mediaExamene+"\n";
        text+="Specilaizare : "+this.specializare+"\n";
        text+="Anul "+this.anulDeStudiu+"\n";
        return text;
    }

}
