package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class classe_simpleDateFormat {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf =new SimpleDateFormat("y"); //padrão da data
		
		Calendar cal = new GregorianCalendar(2010,2,20,14,12,25);
		
		System.out.println("Ano passado: "+sdf.format(cal.getTime())); // data-> retorna objeto do tipo data
		//sdf -> formata a data a partir do padrão passado
		
		sdf =new SimpleDateFormat("dd/mm/yyyy HH:mm:ss z");
		
		System.out.println("Data completa e hora: "+sdf.format(cal.getTime())); //OU:
		
		System.out.println("Data do sistema: "+sdf.format(new Date())); //o format() retorna uma String
		
		String date2 = "20/02/2000";
		sdf =new SimpleDateFormat("dd/mm/yyyy"); 
		Date data = sdf.parse(date2); //o parse() retorna um objeto do tipo date
		System.out.println("Objato do tipo Date vale: "+data); 
		
	}
}
