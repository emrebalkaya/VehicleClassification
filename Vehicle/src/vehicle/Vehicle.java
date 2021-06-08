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
public class Vehicle {
    private String plaka,model,marka;

    public Vehicle(String plaka, String model, String marka) {
        this.plaka = plaka;
        this.model = model;
        this.marka = marka;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    

    @Override
    public String toString() {
        return "Vehicle{" + " Plaka= " + getPlaka()+ " Model= " + getModel() + " Marka= " + getMarka() + "} " ;
    }
    public int compareTo(Vehicle other){
        Vehicle othervehicle= (Vehicle) other;
        if(plaka.compareTo(othervehicle.plaka)==0)
            return 0;
        else if(plaka.compareTo(othervehicle.plaka)>0)
            return 1;
        else
            return -1;
    }    
    
    
}
