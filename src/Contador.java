
import java.util.concurrent.locks.ReentrantLock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author franklinvelasquezfuentes
 */
public class Contador {
    
    
    private int cuenta;
    private ReentrantLock candado;
    

    public Contador() {
        this.cuenta = 0;
        this.candado = new ReentrantLock();
    }
    
    
    public synchronized void aumentar(){  // lock
        
//        this.candado.lock();
        
        this.cuenta = this.cuenta + 1;
        
        candado.lock();
        
        for (int i = 0; i < 10; i++) {
            
            if(true){
                
                candado.unlock();
                
            } else {
                
            }
            
        }
        
//        this.candado.unlock();
//        
        
        // Cambio de Contexto (switch) -> Bajo Nivel (Binario)
        
        /*
        
        Hilo 1 : 
        
        --- Lock ! 
        
        h = h + 0;
        t1 = heap[h];    {  cuenta (t1) = 500 }       
        t2 = t1 + 1;    { 501 }
        h = h + 0;
        heap[h] = h2;  { escritura cuenta = 501 }
        
        --- Unlock ! 
        
        Hilo 2 : 
        
        h = h + 0;
        t1 = heap[h];    {  cuenta (t1) = 500 }
        t2 = t1 + 1;     { 501 }
        h = h + 0;
        heap[h] = h2;    { escritura cuenta = 501 }
        
                        ---- > Regreso al otro hilo
        
        
        
        
        */
                
          
        
        // unlock
    }

    public int getCuenta() {
        return cuenta;
    }

}
