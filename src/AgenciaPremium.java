/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AgenciaPremium extends Agencia {
        
   private int classificacao;

    
    
    public int getClassificacao(){
         return this.classificacao;
     };
    
    public void setClassificacao(int classificacao){
         this.classificacao = classificacao;
     };
    
    public AgenciaPremium(String numero, String nome, Banco banco, int classificacao) {
        
        super(numero, nome, banco);
        this.setClassificacao(classificacao);
    }
    public void imprime(){
    super.imprime();
    System.out.println(" Classificação: "+ classificacao);
    }
}
