/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Agencia {
    
     private String nome;
    private String numero;
   
    private Banco banco = null;
    
    public Banco getBanco(){
         return this.banco;
     };
    
    public void setBanco(Banco banco){
         this.banco = banco;
     };
    
    public String getNome(){
         return this.nome;
     };
    
    public String getNumero(){
         return this.numero;
     };
    
    public void setNome(String Nome){
         this.nome = nome;
     };
    
    public void setNumero(String numero){
         this.numero = numero;
     };
    
    
    public void imprime(){
         
         System.out.println(" Numero: "+ numero + "  Nome: " + nome + "  Banco: "+ banco);
         
     }
    
    
    
     public Agencia(String nome, String numero, Banco banco){
         
         this(nome, numero);
        this.setBanco(banco);
    }
     
     public Agencia(String nome, String numero){
        this.setNome(nome);
        this.setNumero(numero);
     }
}
