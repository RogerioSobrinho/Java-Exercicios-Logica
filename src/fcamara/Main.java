/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcamara;

import java.util.Calendar;

/**
 *
 * @author Rogerio Sobrinho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Exericico 01
        float salarioAtual = getSalarioAtual(2005,1000.00f,1.5f);
        System.out.println("O salario atual eh: R$ " + salarioAtual);
        
        // Exericico 02
        String primos = getNumerosPrimos(2,13);
        System.out.println("Sequencia de numeros primos eh: " + primos);
        
        // Exericico 03
        float getSalarioAhReceber = getSalarioAhReceber(120,700);
        System.out.println("O salario ah receber eh: " + getSalarioAhReceber);
        
        // Exercicio 04
        System.out.println(getQuantidadeLatas(160.0d));
        
        // Exercicio 05
        // Criado classe conta corrente
    }
    
    public static float getSalarioAtual(int anoContratado, float salarioInicial, float basePorcAumPriAno ){
        float salario = 0;
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        float porcentagemAumento = basePorcAumPriAno;
        
        for(int i=anoContratado+1;i<anoAtual;i++){
            if(anoContratado < 2017){
                salario += salarioInicial + ((salarioInicial / 100) * basePorcAumPriAno);
            }
            
            if(anoContratado >= 2017){
                porcentagemAumento = porcentagemAumento * 2;
                salario += salarioInicial + ((salarioInicial / 100) * porcentagemAumento);
            }
        }
        
        return salario;
    }
    
    public static String getNumerosPrimos(int intervaloInicial, int intervaloFinal){
        String primos = "";
        
        for(int i = intervaloInicial; i <= intervaloFinal; i++){
            if(ehPrimo(i)){
                primos += i + " ";
            }
        }
        
        return primos;
    }
    
    public static float getSalarioAhReceber(int horasTrabalhadas, float valorSalarioMinimo){
        
        float salarioHoraTrabalhada = (valorSalarioMinimo/100)*10;
        float salarioButro = horasTrabalhadas * salarioHoraTrabalhada;
        float imposto = (salarioButro / 100) * 3;
        return salarioButro - imposto;
    }
    
    public static String getQuantidadeLatas(double metrosQuadrados){
        double litros = Math.ceil((metrosQuadrados / 3));
        double latas = Math.ceil((litros / 18));
        double preco = latas * 80.0f;
        return "Comprar " + latas + " latas por R$ " + preco;
    }
    
    private static boolean ehPrimo(int numero){
        int contador = 0;
        for(int i=numero; i > 0; i--){
            if(numero % i == 0){
                contador++;
            }
        }
        
        return contador == 2;
    }
    
}
