/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcamara;

/**
 *
 * @author Rogerio Sobrinho
 */
public class ContaCorrente {
    final private int numero;
    private String nomeCorrentista;
    private double saldo;
    
    public ContaCorrente(int numero, String nomeCorrentista){
        this.numero = numero;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0d;
    }
    
    public void alterarNome(String novoNome){
        this.nomeCorrentista = novoNome;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
    }
}
