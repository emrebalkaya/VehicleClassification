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
public class Car extends Vehicle {
    private int kapıSayısı;

    public Car(int kapıSayısı, String plaka, String model, String marka) {
        super(plaka, model, marka);
        this.kapıSayısı = kapıSayısı;
    }    

    public int getKapıSayısı() {
        return kapıSayısı;
    }

    public void setKapıSayısı(int kapıSayısı) {
        this.kapıSayısı = kapıSayısı;
    }

    
    @Override
    public String toString() {
        return "Car{" + " Plaka: "+ getPlaka()+ " Marka: "+getMarka()+" Model: "+getModel()+ " Kapı Sayısı= " + getKapıSayısı()+"} ";
    }
    
    
}
