/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
class Teste {
    
    
    
    public static void main(String[] args){
    Banco banco = new Banco(3);
    banco.imprime();   
    
    Agencia agencia1 = new Agencia("Rafael", "18" , banco);
    
    Agencia agencia2 = new Agencia("Rafael Peangelo", "18");
    
    AgenciaPremium agenciaPremium = new AgenciaPremium("Rafael", "234", banco, 329);
    
    agencia1.imprime();
    agencia2.imprime();
    agenciaPremium.imprime();
    
    }

}
