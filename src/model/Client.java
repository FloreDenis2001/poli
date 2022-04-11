package model;

public class Client extends Person {
    private int id;
    private String nume;
    private String prenume;
    private String importanta;

    public Client(int id, String nume, String prenume, String importanta) {
        super("password5", "denis2001");
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.importanta = importanta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getImportanta() {
        return importanta;
    }

    public void setImportanta(String importanta) {
        this.importanta = importanta;
    }

    public String descriereClient() {
        String text = super.descriere();
        text += "Id :" + this.id + "\n";
        text += "Nume : " + this.nume + "\n";
        text += "Prenume : " + this.prenume + "\n";
        text += "Importanta : " + this.importanta + "\n";
        return text;
    }
}
