package varArgs;

public class Run {

	public static void main(String[] args) {
		
       System.out.println(somar(1,2,3,4,5,6,7,8,9)); //inúmeros parâmetros pode ser passados
	}

	private static Integer somar(int a,int b, int ... varargs) {
		//você tbm pode passar somente o varargs sozinho no parametro!
		
		int total =0;
		
		for(int j=0; j<varargs.length; j++) {
			total += varargs[j];
		}
		
		return total;
	}
}
