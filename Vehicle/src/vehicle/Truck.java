/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Emre
 */
public class Truck extends Vehicle {
    private int yükKapasite;
    
    public Truck(int yükKapasite, String plaka, String model, String marka) {
        super(plaka, model, marka);
        this.yükKapasite = yükKapasite;
    }
    public int getYükKapasite() {
        return yükKapasite;
    }
    public void setYükKapasite(int yükKapasite) {
        this.yükKapasite = yükKapasite;
    }
    @Override
    public String toString() {
        return "Truck{" +  " Plaka: "+ getPlaka()+ " Marka: "+getMarka()+" Model: "+getModel()+" Yük Kapasitesi= " + getYükKapasite()+"} ";
    }

    
    
    
}
