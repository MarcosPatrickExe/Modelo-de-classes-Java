package enum_classe; 

import java.util.Date;

import enum_classe.Formulario.Genero;
import enum_classe.Formulario.TipoDocumento;

public class Testar {
	public static void main(String[] args) {
		System.out.println("Imprimindo todos os dias da semana... \n");

		for(DiaSemana d : DiaSemana.values()) {
			System.out.print(d+" | ");
		}
		System.out.println();
		
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString()+" --> "+dia.getValor()+"\n");
/*
		System.out.println("Mostrando o valor do enum diaSemana > quarta : "+DiaSemana.QUARTA); //OU:
		System.out.println(Enum.valueOf(DiaSemana.class, "QUARTA")); //OU: 
		System.out.println(DiaSemana.valueOf(DiaSemana.class, "QUARTA")); */

		Formulario f = new Formulario();
		f.setNome("Jhon");
		f.setGenero(Genero.MASCULINO);
        f.setTipoDocumento(TipoDocumento.CPF); //OU:
       // f.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        f.setNumeroDocumento(f.getTipoDocumento().geraNumeroTeste());
        
		System.out.println("Nome: "+f.getNome()+" Sexo: "+f.getGenero()+" Tipo do documento: "+
		f.getTipoDocumento()+" Número do documento gerado: "+f.getNumeroDocumento());
	}
}
