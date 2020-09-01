package date;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;


class novaAPI_date {

	public static void main(String[] args) throws java.text.ParseException{
		//----------------------------------------LocalDate-------------------------------------------------
		LocalDate agora = LocalDate.now(); //data local
        System.out.println(agora);
        
        System.out.println(LocalDate.of(2019, 2, 1)); 
        System.out.println(LocalDate.parse("2019, 2, 1")); //transforma String em Date
		
        System.out.println(agora.plusDays(30)); //adiciona 30 dias à data original
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		//o minus() diminui em 1 mês na data original
	    // o Enum ChronoUnit simboliza a unidade de mês
        
        agora.getDayOfWeek(); //retorna o dia da semana
        agora.getDayOfMonth(); //retorna o dia do mês
        agora.getDayOfYear(); //retorna o dia do ano
        
        agora.isLeapYear(); //retorna true se ano for bissexto
        
        LocalTime hNow = LocalTime.now(); //Hora local
        System.out.println(hNow);
        
        LocalTime.of(20, 18); //inclui um novo horário
        LocalTime.parse("20:18");
        
        hNow.plusMinutes(50);
        hNow.minus(40, ChronoUnit.MINUTES); //diminuiem 40 minutos da hora atual
        
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);
        
        agoraCompleto.plusYears(20); //adiciona 20 anos na data 
        LocalDateTime.of(2019, 2,16, 20, 25,10); //inclui um novo horário e data
        
      //----------------------------------------ZoneId------------------------------------------------------
        
        ZoneId fuso = ZoneId.systemDefault(); //retorna o fuso horário que o horário local se baseia
        //exemplo: America/Sao_Paulo
        
        Set<String> fusos = ZoneId.getAvailableZoneIds(); //retorna um ArrayList de todos os fusos existentes
        
        for(String f: fusos) { System.out.println(f); }
        
        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"),sp);//OU:
       // ZonedDateTime zdt = ZonedDateTime.parse("2019-02-16T20:25:10-02:00");
        
        
      //----------------------------------------ZoneOffset------------------------------------------------------ 
        
        ZoneOffset offset = ZoneOffset.of("+02:00"); //offSet local
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset); //offset adicionado à data
        
        System.out.println(offsetdt);
        
        Date data= new Date();
        Calendar c = Calendar.getInstance();
        
        LocalDateTime ldtDate = LocalDateTime.ofInstant(data.toInstant(),sp);
        
        System.out.println(ldtDate);
        
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
       
        
       //----------------------------Dates, LocalDate, LocalDateTime------------------------------------------ 
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date primeiraDt = sdf.parse("01/01/2019");
        Date segundaDt = sdf.parse("01/02/2019");
        
        long diffEmMill=Math.abs(segundaDt.getTime()-primeiraDt.getTime());
        System.out.println(diffEmMill);
        
        long diff = TimeUnit.DAYS.convert(diffEmMill, TimeUnit.MICROSECONDS);
        System.out.println(diff);
        
        //OU:
        int dias = (Integer.parseInt(""+diffEmMill)/(1000*60*60*24));
        System.out.println(dias);
        
        //***
        
        LocalDate data1 = LocalDate.of(2019, 01, 01);
        LocalDate data2 = LocalDate.of(2019, 02, 01);
        Period periodo = Period.between(data1, data2);
        int diass = periodo.getDays();
        int meses = periodo.getMonths();
        System.out.println("dias: "+dias+" | meses: "+meses);
        
        //***
        
        LocalDate data3 = LocalDate.of(2019, 01, 01);
        LocalDate data4 = LocalDate.of(2019, 02, 01);
        Duration duracao= Duration.between(data1, data2);
        long diffy = duracao.toHours();   //OU:
        
        // long diffy = ChronoUnit.HOURS.between(data3, data4);
	}
}
