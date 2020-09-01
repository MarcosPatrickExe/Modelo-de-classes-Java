package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

class classe_timeZone {
 
	public static void main(String[] args) {
		
       Calendar cal = Calendar.getInstance(); //retorna uma inst�ncia de Calendar
       TimeZone tz = cal.getTimeZone(); //retorna uma inst�ncia de TimeZone
       
       System.out.println("TimeZone: "+tz); //imprime timZone local
       
       String[] fusos=TimeZone.getAvailableIDs(); //retorna um vetor com todos os fusos hor�rios do mundo
       
       for(String fuso: fusos) { //imprimindo todos os IDs timeZones existentes
    	   System.out.println();
       }
	   
       TimeZone tzSP = TimeZone.getTimeZone("America/Sao Paulo"); //timeZone especifico de Sao Paulo
       System.out.println(tzSP.getDisplayName()); //brasilia Standard time
       System.out.println(tzSP.getID()); //America/Sao Paulo
       
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z"); //hor�rio militar
       System.out.println(sdf.format(cal.getTime()));
       
       Calendar agoraSP = Calendar.getInstance(tzSP); //passando o timeZone de SP
       System.out.println(sdf.format(agoraSP.getTime())); //retorna o hor�rio de S�o Paulo
       
       agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset(System.currentTimeMillis())/1000/60/60);
       System.out.println(sdf.format(agoraSP.getTime())); //imprime a data e hora com o offSet de SP
       
	}
}
