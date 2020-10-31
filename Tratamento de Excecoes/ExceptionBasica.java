package excecoesErros;

public class ExceptionBasica {

	public static void main(String[] args) {
	
		try {
         int[] vet = new int[5];
		 vet[5]=10;
		 
		}catch( java.lang.ArrayIndexOutOfBoundsException exc){
			System.out.println("Ocorreu um erro");
		}
		 
		System.out.println("exibido");
		
	}

}
