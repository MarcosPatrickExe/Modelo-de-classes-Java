package excecoesPersonalizadas;

public class TestarExcecaoInterna {
	public static void main(String[] args) {
		int[] num = {4, 8, 15, 32, 64, 128};
    int[] demon = {2, 0, 4, 8, 0};
		
    for(int i=0; i<num.length;i++) {
      
          try {
        	if(num[i]%2 != 0) {
        		throw new Exception("Número ímpar, divisão não exata!");
        	}

        	System.out.println(num[i]+"/"+demon[i]+" = "+num[i]/demon[i]);
	         
          } catch (Exception e) {
        	  System.out.println("no catch");
        	  
		    }finally{
        	  System.out.println("no finally");
        }
	  }
        
 }
}