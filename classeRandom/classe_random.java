package numerosAleatorios;

import java.util.Random;

class classe_random {
	public static void main(String[] args) {
		
       System.out.println("Gerando n�mero com Math: "+Math.random()+"\n"); //0.393....
	   
       System.out.println("Gerando n�mero com Math arredondado: "+Math.floor(Math.random()*100)+"\n"); 
       //usando m�todo da classe Math com arredondamento
       
       Random aleatorio = new Random(); //Utilizando objeto da classe Random
       System.out.println("Gerando n�mero: "+aleatorio.nextInt(100)+"\n"); //gera um numero inteiro entre 0 e 99      
	}
}
