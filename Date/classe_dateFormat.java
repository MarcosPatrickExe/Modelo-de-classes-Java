package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class classe_dateFormat {

	public static void main(String[] args) throws ParseException {
		//a classe DateFormat é abstrata e estática
		
		Date hoje = new Date();
		
		System.out.println("data atual no tipo Date: "+hoje+"\n ");
		
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println("data e hora atual formatada: "+hojeFormatado+"\n ");
		
		Locale.setDefault(new Locale("pt", "Brazil"));
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje); //retorna somente a data
		System.out.println("data atual formatada com locale: "+hojeFormatado+"\n ");
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje); //retorna somente a hora 
		System.out.println("hora atual: "+hojeFormatado+"\n ");
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
		System.out.println("data e hora atual: "+hojeFormatado+"\n ");
		
		//transformando String em Date:
		
		String data = "12-02-2017 14:25";
		
		Date dataDate = DateFormat.getInstance().parse(data);
		
		System.out.println("data atual no tipo Date: "+hoje+"\n ");
		
		//DateFormat para Calendar:
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataDate);
		System.out.println(cal);
	}
}
