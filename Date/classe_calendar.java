package date;

import java.util.Calendar;

class classe_calendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance(); //padr�o singleton
		
		System.out.println(hoje);

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutes = hoje.get(Calendar.MINUTE);
		int seconds = hoje.get(Calendar.SECOND);
		
		System.out.println("Hoje �: "+dia+" de "+mes+" "+ano+" �s "+hora); //OU:
		
		System.out.printf("hoje �: %02d / %02d / %d", dia, (mes+1), ano); //usando o printf()
		
		//no Java, janeiro tem valor 0 e dezembro 11, por adiciona-se uma unidade no m�s para
		//ger�-lo corretamente;
	    
		System.out.printf("�s: %d : %d : %02d", hora, minutes, seconds);
		
		hoje.add(Calendar.DAY_OF_MONTH, 1); //adiciona 1 dia a mais no dia do m�s
		
	}
}
