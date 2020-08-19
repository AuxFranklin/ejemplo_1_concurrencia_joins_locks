/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franklinvelasquezfuentes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        
  
        
        Contador contador = new  Contador();
                
        Hilo hiloA = new Hilo("Hilo A", contador);
        Hilo hiloB = new Hilo("Hilo B", contador);
        
        
        hiloA.start();
        hiloB.start();


        hiloA.join();
        hiloB.join();
        
        /*
        
        Hilo Main   (espera A , espere B )

        
        Hilo A       (entre A y B no hay espera)           
        Hilo B          
        
        
        -----    ---      ---> Hilo A
        
        ----- ---     ----      --> Hilo B 
        
        */
        
        
        
        System.out.println(" >>>>>>>>>>>>>     Cuenta :  "  + contador.getCuenta() + " <<<<<<<<<<<<<<<<<"); // (1)
        

        
    }
    
}
