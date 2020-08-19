
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author franklinvelasquezfuentes
 */
public class Hilo  extends Thread{
    
    
    private String nombre; 
    private Contador contador;

    public Hilo(String nombre, Contador contador) {
        this.nombre = nombre;
        this.contador = contador;
    }
    

    @Override
    public void run() {
       
        for (int i = 0; i < 2000; i++) {
            this.contador.aumentar();
            
        //   System.out.println(this.nombre + " - " + this.contador.getCuenta()); 
        }
        
        System.out.println("fin " + nombre);
    }
    
    
    
    

}
