package model;

public class Employee extends Person{
    private float salar;
    private String post;
    public Employee(float salar,String post){
         super("franzela","test@gmail.com");
         this.salar=salar;
         this.post=post;
    }

    public float getSalar() {
        return salar;
    }

    public void setSalar(float salar) {
        this.salar = salar;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String descriereEmployee(){
        String text = super.descriere();
        text+="Salar : "+this.salar+"\n";
        text+="Post: "+this.post+"\n";
        return text;
    }


}
