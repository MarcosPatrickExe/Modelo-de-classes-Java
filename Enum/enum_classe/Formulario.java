package enum_classe;

import classes_estáticas_especiais.GeraCpfCnpj;

public class Formulario {
     private String nome;
     private Genero genero;
     private TipoDocumento td;
     private String numeroDocumento;
     
//---------------------------------------------------------------------------------------------------     
     enum Genero{ //OBS: esse Enum só terá escopo dentro da classe formulário!
    	 FEMININO('F'), MASCULINO('M');
 
    	 char s;
    	 Genero(char s){
    		 this.s = s;
    	 }
     }
//-----------------------------------------------------------------------------------------------------
     enum TipoDocumento{ //OBS: esse Enum só terá escopo dentro da classe formulário
    	// JOAO("999.999.999-99"), VICTOR("888.888.888-88"),
         //Os enumeradores acima não podem ser anonimados como o CPF e CNPJ, somente instanciados
   
    	 CPF{ //anonimando 
    		// String cpf2;
    		 
    		 @Override
    		 public String geraNumeroTeste() { //não é possível usar esse método se cpf for instanciado!
    			return GeraCpfCnpj.cpf();
    		 }
     
    	 }, //USE A VÍRGULA PARA SEPARAR OS ENUNS!
    	 
    	 CNPJ{ //anonimando 
    		// String cpf2;
    		 
    		 @Override
    		 public String geraNumeroTeste() { //não é possível usar esse método se cnpj for instanciado!
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
