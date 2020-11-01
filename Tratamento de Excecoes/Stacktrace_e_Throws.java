package excecoesErros;

import java.util.Scanner;

public class Stacktrace_e_Throws {
	
	/* NOTA: a classe Throwable é super de todos os erros e exceções do Java.
	 * A classe Exception é a super classe das exceções do Java.*/
	
	/* A palavra-chave Throws é usada na assinatura do método. Isso para lançar 
	 * uma exception que poderá ocorrer dentro dele à quem chamá-lo. O tipo da exception 
	 * é dada após a palavra-chave*/

	public static void main(String[] args) {
		System.out.println("Entre com um numero decimal...");
		
        try {
        	Double num = leNumero(); //Exception recebida
        	
        	if(num instanceof Double) {
        		System.out.println("Número inserido: "+num);
        	}
        	
        }catch(Exception e) {
        	e.printStackTrace(); //retorna a linha em que o erro ocorreu
        	e.getMessage(); //retorna a descrição do erro
        	System.out.println("Entrada inválida");
        }
	}
	
	private static Double leNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		Double n = scan.nextDouble();
		scan.close();
		return n;
	}

}
