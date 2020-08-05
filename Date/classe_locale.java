package date;

import java.text.NumberFormat;
import java.util.Locale;

class classe_locale {

	public static void main(String[] args) {
		//a classe Locale apresenta diferentes formatos de informa��es dependendo da localiza��o geogr�fica

		// dd/MM/yyyy - no Brasil
		// MM/dd/yyyy - no EUA
		
		// 1.000,02 - no Brasil
		// 1,000.02 - no EUA
		
		Locale locale = Locale.getDefault(); //locale padr�o j� ativo na m�quina
		
		Locale[] locales = Locale.getAvailableLocales();// retorna todos os locales existentes
		
		System.out.println("C�digo: "+locale.getLanguage()+"\n Nome: "+locale.getDisplayLanguage()+"\n "
		+"C�digo do pa�s: "+locale.getCountry()+"\n Nome do pa�s: "+locale.getDisplayCountry());
		
		for(Locale loc : locales) System.out.println(" | Nome: "+loc.getDisplayName()+" | ");
		   
		Locale br = new Locale("pt","Brazil"); //criando um locale local
		Locale.setDefault(br); //ativando locale local
		System.out.println("Locale insrido: "+br);
		
		System.out.println(NumberFormat.getCurrencyInstance().format(500000000)); //formata��o brasileira
		
		System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(500000000));
		//formata��o estrangeira
	}
}
