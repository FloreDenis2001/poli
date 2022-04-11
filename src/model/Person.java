package model;

public class Person {
    private String password;
    private String username;
    private int age;
    private String phone;
    private String email;


    public Person(String password, String username, int age, String phone, String email) {
        this.password = password;
        this.username = username;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Person(String password, String username, String email) {
        this.password = password;
        this.username = username;
        this.email = email;
    }

    public Person(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String descriere() {
        String text = "Password : " + this.password + "\n";
        text += "UserName: " + this.username + "\n";
        text += "Age: " + this.age + "\n";
        text += "Phone : " + this.phone + "\n";
        text += "Email : " + this.email + "\n";
        return text;
    }

    @Override
    public String toString() {
        String text = "Password : " + this.password + "\n";
        text += "UserName: " + this.username + "\n";
        text += "Age: " + this.age + "\n";
        text += "Phone : " + this.phone + "\n";
        text += "Email : " + this.email + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o){
        Person person =(Person) o;
        return this.email.equals(person.email) && this.age==person.age;
    }
}
