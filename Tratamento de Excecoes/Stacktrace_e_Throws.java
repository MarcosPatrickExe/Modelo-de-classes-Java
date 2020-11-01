package excecoesErros;

import java.util.Scanner;

public class Stacktrace_e_Throws {
	
	/* NOTA: a classe Throwable � super de todos os erros e exce��es do Java.
	 * A classe Exception � a super classe das exce��es do Java.*/
	
	/* A palavra-chave Throws � usada na assinatura do m�todo. Isso para lan�ar 
	 * uma exception que poder� ocorrer dentro dele � quem cham�-lo. O tipo da exception 
	 * � dada ap�s a palavra-chave*/

	public static void main(String[] args) {
		System.out.println("Entre com um numero decimal...");
		
        try {
        	Double num = leNumero(); //Exception recebida
        	
        	if(num instanceof Double) {
        		System.out.println("N�mero inserido: "+num);
        	}
        	
        }catch(Exception e) {
        	e.printStackTrace(); //retorna a linha em que o erro ocorreu
        	e.getMessage(); //retorna a descri��o do erro
        	System.out.println("Entrada inv�lida");
        }
	}
	
	private static Double leNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		Double n = scan.nextDouble();
		scan.close();
		return n;
	}

}
