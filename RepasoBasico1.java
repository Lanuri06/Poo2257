/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico1;

import ico.fes.dispositivos.SmartPhone;
import ico.fes.inegi.Encuestadorinegi;

/**
 *
 * @author Alan
 */
public class RepasoBasico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    SmartPhone cel1 = new SmartPhone("Samsung");
    SmartPhone cel2 = new SmartPhone("Huawei", "P40", "Gris", 5.5f);
    SmartPhone cel3 = new SmartPhone("Apple", "iPhone 8 Plus");

    System.out.println (cel1 );

    System.out.println (cel2 );
    
    System.out.println(cel3);
    
    Encuestadorinegi enc1=new Encuestadorinegi();
    enc1.setDispositivo(cel2);
    
    //Uso de métodos de acceso
    cel1.setModelo("Galaxy Note 10");
        System.out.println(cel1);
        
        System.out.println("Marca del cel: " + cel1.getMarca() );
    }
}
