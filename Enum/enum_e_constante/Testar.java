package enum_e_constante;

public class Testar {

	public static void main(String[] args) {
        usandoConstantes();
        usandoEnums();
	}

	private static void usandoConstantes() {
		int seg = ConstantesDiaSemana.SEGUNDA; 
		int ter = ConstantesDiaSemana.TERCA;
		int qua = ConstantesDiaSemana.QUARTA;
		int qui = ConstantesDiaSemana.QUINTA;
		int sex = ConstantesDiaSemana.SEXTA;
		int sab = ConstantesDiaSemana.SABADO;
		int dom = ConstantesDiaSemana.DOMINGO;
		
		/*acima, as variáveis só podem receber valores inteiros, podendo receber aqueles 
		que não foram aguardados pelo sistema */
		
		System.out.println("Trabalhando com constantes... \n");
		imprimeDiaSemana(seg);
		imprimeDiaSemana(ter);
		imprimeDiaSemana(qua);
		imprimeDiaSemana(qui);
		imprimeDiaSemana(sex);
		imprimeDiaSemana(sab);
		imprimeDiaSemana(dom);
	}
	
	private static void imprimeDiaSemana(int dia) {
    	switch(dia) {
    	   case 1:
    		   System.out.println("segunda");
    		   break;
    	   case 2:
    		   System.out.println("terça");
    		   break;
    	   case 3:
    		   System.out.println("quarta");
    		   break;
    	   case 4:
    		   System.out.println("quinta");
    		   break;
    	   case 5:
    		   System.out.println("sexta");
    		   break;
    	   case 6:
    		   System.out.println("sabado");
    		   break;
    	   case 7:
    		   System.out.println("domingo");
    		   break;
    	}
    }
	
	private static void usandoEnums() {
		diaSemana seg = diaSemana.SEGUNDA;
		diaSemana ter = diaSemana.TERCA;
		diaSemana qua = diaSemana.QUARTA;
		diaSemana qui = diaSemana.QUINTA;
		diaSemana sex = diaSemana.SEXTA;
		diaSemana sab = diaSemana.SABADO;
		diaSemana dom = diaSemana.DOMINGO;
		
		System.out.println("\n Trabalhando com Enums... \n");
		imprimeDiaSemana(seg);
		imprimeDiaSemana(ter);
		imprimeDiaSemana(qua);
		imprimeDiaSemana(qui);
		imprimeDiaSemana(sex);
		imprimeDiaSemana(sab);
		imprimeDiaSemana(dom);
	}	
    
    private static void imprimeDiaSemana(diaSemana dia) {
    	switch(dia) {
    	   case SEGUNDA:
    		   System.out.println("segunda");
    		   break;
    	   case TERCA:
    		   System.out.println("terça");
    		   break;
    	   case QUARTA:
    		   System.out.println("quarta");
    		   break;
    	   case QUINTA:
    		   System.out.println("quinta");
    		   break;
    	   case SEXTA:
    		   System.out.println("sexta");
    		   break;
    	   case SABADO:
    		   System.out.println("sabado");
    		   break;
    	   case DOMINGO:
    		   System.out.println("domingo");
    		   break;
    	}
    }	
}
