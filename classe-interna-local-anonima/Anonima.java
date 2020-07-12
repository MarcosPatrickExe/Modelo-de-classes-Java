package classes_interna_local_anonima;

public class Anonima {
	
	String nomeClasse = "Anonima";
	String tipoClasse = "normal";
	
    void imprimirTexto() {
    	System.out.println("Texto da classe Anonima.... \n");
    }
    
    String getNome() {
		return this.nomeClasse;
	}
	
    String getNome2() {
		return this.tipoClasse;
	}
    
	public static void main(String[] args) {
       
		Anonima anon = new Anonima() {
			private String nomeClasse = "anonima2";
		    private String tipoClasse = "classeEdition"; //adicionando um novo atributo na classe principal
			
			void imprimirTexto() { //alterando um metodo da classe principal
				System.out.println("Texto da classe Anonima agora foi alterado por "
				        + this.nomeClasse +" no método main \n");
			}
			
			String getNome() {
				return this.nomeClasse;
			}
			
			String getNome2() {
				return this.tipoClasse;
			}};
		
		System.out.println("Novo nome da classe Anonima: "+anon.getNome()+"\n");
		anon.imprimirTexto();
		
		System.out.println("Nome do novo atributo adicionado à classe: "+anon.getNome2()+"\n");
		anon.imprimirTexto();
		
		//---------------------------------------------------------------------------------------------
		System.out.println("INSTANCIANDO INTERFACE...");
		
		TextoInterface text = new TextoInterface() { //instanciando uma interface!
			 public void imprimeTexto() {
				 System.out.println("imprimindo o texto da interface");
			 }
		      public void editarTexto() {System.out.println("alterando o texto da interface");}
		      
		      public int numeroCaracteres(String t) {
		    	  return t.length();
		      }
		      
		      public String simbolos() { return "%¨&*)($%#@"; }
		};
		 
		 System.out.println("constante ANO na interface vale: "+TextoInterface.ANO); //OU:
	    //System.out.println("constante ANO na interface vale: "+text.ANO);
		 
		 text.imprimeTexto();
		 text.editarTexto();
		 System.out.println(text.numeroCaracteres("interface")+" Símbolos: "+text.simbolos());
		
	}
}
