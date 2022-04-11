package ex2;

import java.util.ArrayList;

public class Car extends Vehicule {
    String color;
    private int amountOfDoors;
    private int speedCar;

    public Car(String color, int amountOfDoors, ArrayList<Roata> roti,int speedCar){
        super("Mercedes","151412561236",roti);
        this.color=color;
        this.amountOfDoors=amountOfDoors;
        this.speedCar=speedCar;
    }

    @Override
    public int viteza(){
        return  this.speedCar;
    }




}
