package classes_interna_local_anonima;

 class Pessoa {
     String nome;
     int idade;
     double altura;
     
     void falar() {System.out.println("Ol�! Tudo bem com voc�?!");}
     
 //----------------------------------------------------------------------Classe interna:
     private static class Rocker{ //se ela for public, poder� ser acessada em qualquer pacote!
    	 static String bandaFavorita = "Linkin Park";
    	 
    	 static void tocarGuitarra() {
    		 System.out.println("Tocando guitarra");
    	 }
     } //classes internas tamb�m podem ser est�ticas assim como vari�veis e m�todos!
 //------------------------------------------------------------------------------
     
     static void main(String args[]) {
    	 Pessoa pes = new Pessoa();
    	 pes.falar();
    	 
    	 System.out.println(Rocker.bandaFavorita); //OU:
    //	 System.out.println(new Rocker().bandaFavorita);
    	 
   //System.out.println(new Pessoa().new Rocker().bandaFavorita); isso seria possivel se a classe n fosse estatica
    	 
     // new Rocker();//primeira forma de instanciar o objeto Rocker;    	 
     //Rocker roc = pes.new Rocker(); segunda forma de instanciar o objeto Rocker se essa n for est�tica;
    	 
    	 Rocker.tocarGuitarra(); //OU:
    	 //new Rocker().tocarGuitarra();
     }
}
