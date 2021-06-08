/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class DoublyLinkedListTest {
    public static void main(String[] args) throws FileNotFoundException {
        Vehicle[] array = new Vehicle[100];
        Vehicle[] işlemlerarray = new Vehicle[100];
        String filename = "veriler.txt";
        File textFile = new File(filename);
        Scanner veriler= new Scanner(textFile);
        String line;
        int count=0;
        while (veriler.hasNextLine()){
            line=veriler.nextLine();
            String[] LineSplit=line.split(" ");//veriler dosyasındaki her satırdaki verileri boşluklara göre ayırıp tutulur.
            //satırdaki ilk kelimeye göre car veya truck nesnesi oluşturulup önceden tanımladığımız array'e nesneler eklenir.
            if("car".equals(LineSplit[0])){
               array[count] =new Car(Integer.valueOf(LineSplit[4]),LineSplit[1],LineSplit[2],LineSplit[3]);
                   
            }
            else{
                array[count] = new Truck(Integer.valueOf(LineSplit[4]),LineSplit[1],LineSplit[2],LineSplit[3]);
                
            }
            count++;   
        }
        veriler.close();
        for(int i=0;i<array.length;i++){
            while(array[i]!=null){
                System.out.println(array[i]);
                if(array[i].getClass()==Car.class){//eğer nesne bir car nesnesiyse kapı sayılarına göre arabanın türü belirlenir.
                    if(((Car) array[i]).getKapıSayısı()==2)
                        System.out.println("Bu bir spor araba");
                    else if(((Car) array[i]).getKapıSayısı()==4)
                        System.out.println("Bu bir standart araba");
                    else
                        System.out.println("Bu bir SWagon araba");
                }
                break;
            }
        }
        DoublyLinkedList dll = new DoublyLinkedList();
        for(int i=0;i<array.length;i++){//Doublylinkedlist oluşturulup arraydeki nesneler listeye atılır.
            while(array[i]!=null){
                dll.Add(array[i]);
                break;
            }
        }
        dll.LeftToRightDisplay();
        String işlemlerfile = "işlemler.txt";
        File file = new File(işlemlerfile);
        Scanner işlemler= new Scanner(file);
        String işlemlerline;
        int sayaç=0;
        while (işlemler.hasNextLine()){
            işlemlerline=işlemler.nextLine();
            String[] işlemlerLineSplit=işlemlerline.split(" ");//işlemler dosyasındaki her satırdaki verileri boşluklara göre ayırıp tutulur.
            // eğer ilk veri "ekle" ise ekleme işlemi 2. veriye göre car veya truck nesnesi olarak oluşturulup yapılır.
            if("ekle".equals(işlemlerLineSplit[0])){
                if("car".equals(işlemlerLineSplit[1])){
                    işlemlerarray[sayaç] =new Car(Integer.valueOf(işlemlerLineSplit[5]),işlemlerLineSplit[2],işlemlerLineSplit[3],işlemlerLineSplit[4]);
                    dll.Add(işlemlerarray[sayaç]);
                }
                else if("Truck".equals(işlemlerLineSplit[1])){
                    işlemlerarray[sayaç] = new Truck(Integer.valueOf(işlemlerLineSplit[5]),işlemlerLineSplit[2],işlemlerLineSplit[3],işlemlerLineSplit[4]);
                    dll.Add(işlemlerarray[sayaç]);
                }
            }
            else if("sil".equals(işlemlerLineSplit[0])){//eğer ilk veri "sil" ise girilen plakaya sahip nesne listeden silinir.
                dll.Delete(işlemlerLineSplit[1]);
                }
                
            sayaç++;  
        }    
        işlemler.close();
        dll.LeftToRightDisplay();
        dll.RightToLeftDisplay();
    }  
}
