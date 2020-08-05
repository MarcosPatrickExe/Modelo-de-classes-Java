package date;

import java.util.Calendar;
import java.util.GregorianCalendar;

class classe_gregorianCalendar {

	static void imprimirData(Calendar cal) {
	
		int ano = cal.get(Calendar.YEAR);
		int mes = cal.get(Calendar.MONTH);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		
		System.out.println("Hoje é: "+dia+" de "+mes+" "+ano+" às "+hora+":"+minutes+":"+seconds);
	}
	
	public static void main(String[] args) {
		// a classe Calendar é uma instância de GregorianCalendar, logo a última é estende a primeira
		// que é abstrata e não pode ser instanciada!

		Calendar cal = Calendar.getInstance(); //instanciando um objeto de GregorianCalendar
		//OU:
		//Calendar hoje2 = new GregorianCalendar(); 
		
		GregorianCalendar hoje = new GregorianCalendar();
		
		System.out.println(hoje.isLeapYear(2017)); //retorna true se o ano passado no argumento for bissexto
		
		new GregorianCalendar(2017,0,1,14,30,23); //o construtor de GregorianCalendar pode receber na ordem:
		//ano, mês, dia, hora, minuto, segundo
		
		imprimirData(new GregorianCalendar()); //passa GregorianCalendar para ser recebido pelo Calendar,
		//sendo um exemplo de polimorfismo
		
		System.out.println();
		
	}
}
