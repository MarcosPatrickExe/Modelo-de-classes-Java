package numerosAleatorios;

import java.util.Random;

class classe_random {
	public static void main(String[] args) {
		
       System.out.println("Gerando número com Math: "+Math.random()+"\n"); //0.393....
	   
       System.out.println("Gerando número com Math arredondado: "+Math.floor(Math.random()*100)+"\n"); 
       //usando método da classe Math com arredondamento
       
       Random aleatorio = new Random(); //Utilizando objeto da classe Random
       System.out.println("Gerando número: "+aleatorio.nextInt(100)+"\n"); //gera um numero inteiro entre 0 e 99      
	}
}
