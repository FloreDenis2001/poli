package ex2;

import java.util.ArrayList;

public abstract class  Vehicule {
   private String model;
   private String licenceNumber;
   private ArrayList<Roata> roti;

   public Vehicule(String model, String licenceNumber, ArrayList<Roata> roti) {
      this.model = model;
      this.licenceNumber = licenceNumber;
      this.roti = roti;
   }
    public void repairState(){
       System.out.println("America");
    }
   public abstract int viteza();
}
