package excecoesErros;

public class ExceptionIntermediaria {

	public static void main(String[] args) {
		int[] num = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};
		
		try {
	        for(int i=0; i<num.length;i++) {
	        	System.out.println(num[i]+"/"+demon[i]+"= "+num[i]/demon[i]);
	        	
	        }
	         
	    }catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Ocorreu um erro de indice inexistente do vetor");
				
		}catch(ArithmeticException exc) {
			System.out.println("Ocorreu um erro de divisao por zero");
			
		}catch(Throwable exc) {
			System.out.println("Ocorreu um erro");
			
		}/* OU pode-se utilizar: catch(ArithmeticException | ArrayIndexOutOfBoundsException | Throwable e) {
			System.out.println("Ocorreu um erro");
		} */
			 
	    System.out.println("fora do catch");

	}

}
