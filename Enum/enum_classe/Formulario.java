package enum_classe;

import classes_est�ticas_especiais.GeraCpfCnpj;

public class Formulario {
     private String nome;
     private Genero genero;
     private TipoDocumento td;
     private String numeroDocumento;
     
//---------------------------------------------------------------------------------------------------     
     enum Genero{ //OBS: esse Enum s� ter� escopo dentro da classe formul�rio!
    	 FEMININO('F'), MASCULINO('M');
 
    	 char s;
    	 Genero(char s){
    		 this.s = s;
    	 }
     }
//-----------------------------------------------------------------------------------------------------
     enum TipoDocumento{ //OBS: esse Enum s� ter� escopo dentro da classe formul�rio
    	// JOAO("999.999.999-99"), VICTOR("888.888.888-88"),
         //Os enumeradores acima n�o podem ser anonimados como o CPF e CNPJ, somente instanciados
   
    	 CPF{ //anonimando 
    		// String cpf2;
    		 
    		 @Override
    		 public String geraNumeroTeste() { //n�o � poss�vel usar esse m�todo se cpf for instanciado!
    			return GeraCpfCnpj.cpf();
    		 }
     
    	 }, //USE A V�RGULA PARA SEPARAR OS ENUNS!
    	 
    	 CNPJ{ //anonimando 
    		// String cpf2;
    		 
    		 @Override
    		 public String geraNumeroTeste() { //n�o � poss�vel usar esse m�todo se cnpj for instanciado!
    		    return GeraCpfCnpj.cpf();
    		 }
     
    	 };  
    	 
    	 public abstract String geraNumeroTeste();
     }
    	/* String cpf;
    	 
    	 TipoDocumento(String c) {
    		this.cpf =c;
    	 } */
     
//------------------------------------------------------------------------------------------------------
     
     String getNome() { return this.nome;}
     Genero getGenero() { return this.genero;}
     TipoDocumento getTipoDocumento() { return this.td;}
     String getNumeroDocumento() { return this.numeroDocumento;}
     
     void setNome(String non) { this.nome = non;}
     void setGenero(Genero sex) { this.genero = sex;}
     void setTipoDocumento(TipoDocumento td) { this.td = td;}
     void setNumeroDocumento(String nd){this.numeroDocumento = nd;}
}
