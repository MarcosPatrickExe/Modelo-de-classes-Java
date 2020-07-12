package garbage_collector;

class UsandoGarbageCollector {
	//	 /1000->    /1000->      /1000->
	//   byte -- kilobyte -- megabyte -- gigabyte 
	//     <-*1000    <-*1000     <-*1000

	private class Contato { //classe static para poder instancia-la no metodo main
	    String nome;	//as variaveis so podem ser estaticas se a classe interna for estatica
		int numero; 
		String email = "@gmail.com";

		Contato(String nome, int numero, String email){
			this.nome= nome;
			this.numero = numero;
			this.email=email; }
	}

	static void obterMemoriaUsada(Runtime runtime) {
		final int div = 1024*1024;

		//runtime permite consultar a memória ocupada pelo programa

		System.out.println("Memória total disponibilizada para o programa: "+runtime.totalMemory()+"\n");

		System.out.println("Memória livre: "+runtime.freeMemory()+"\n");

		System.out.println("Memória ocupada em MB: "+(runtime.totalMemory()-runtime.freeMemory())/div);
	
	}

	public static void main(String[] args) {
		UsandoGarbageCollector gc = new UsandoGarbageCollector();
		Runtime runtime = Runtime.getRuntime(); //padrão singleton

		Contato[] con = new Contato[500];

		for(int c=0;c<con.length; c++) {
			con[c]= gc.new Contato("Contato "+c,Integer.parseInt("1234567"+c),"contato"+c+"@gmail.com");
		    //o tipo de instancia acima só pode ser usada quando a classe interna não for estática	
		}
     
		obterMemoriaUsada(runtime);
		con =null; //tentando esvaziar o vetor Contatos
		runtime.runFinalization();
		Runtime.getRuntime().gc(); //chamando forçadamente o Garbage Collector
		
		System.out.println("Limpando memória usada.... \n");
		
		System.out.println("Memória atual: \n");
		
		obterMemoriaUsada(runtime);
	}
}
