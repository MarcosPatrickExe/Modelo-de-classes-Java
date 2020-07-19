package date;

import java.util.Date;

class classe_date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		System.out.println("milissegundos desde 1 Jan 1970: "+date.getTime());
		
		System.out.println("Dia do mês: "+date.getDate());
	
	}
}
