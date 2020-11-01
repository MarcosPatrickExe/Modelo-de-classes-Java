package excecoesErros;

public class ExceptionComplexa {

	public static void main(String[] args) {
		int[] num = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};
		
		try {
	        for(int i=0; i<num.length;i++) {
	        	System.out.println(num[i]+"/"+demon[i]+"= "+num[i]/demon[i]);
	        	
	        }
	         
	    }catch(ArithmeticException | ArrayIndexOutOfBoundsException  e) {
			System.out.println("Ocorreu um erro");
			System.exit(0); //esse comando interrompe o catch, n�o deixando o finally ser executado!
			
		}finally {
			System.out.println("essa linha s� � expressa depois da execu��o completa"
					+ " do try e do catch. Caso haja alguma interrup��o em dos ambos"
					+ " essa mensagem n�o ser� exibida.");
		}
			 
	    System.out.println("(fora do catch)");

	}

}

