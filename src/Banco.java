/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Banco {
    
    private int numero;
    
    public int getNumero(){
         return this.numero;
     };
    
    public void setNumero(int numero){
         this.numero = numero;
     };
    
 
    public Banco(int numero){
    
        this.setNumero(numero);
            
    }
    
    public void imprime(){
        
         System.out.println(" Numero: " + numero);
     }
}
