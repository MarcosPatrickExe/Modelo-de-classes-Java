package classes_interna_local_anonima;

class Cachorro {

	String name = "mike";
	String raca = "Rothwailer";

	void latir() {
		System.out.println("Au au au au");
	}

	public String getCarrapato(boolean acao) {

		class Carrapato{
			String nomeCientifico = "schromirium";
			boolean retirado = false;

			void tirarCarrapato() {
				System.out.println("Carrapato retirado");
				retirado = true;
			}
			
			String nomeCarrapato() {
				return this.nomeCientifico;
			}
		 }
 
        Carrapato c = new Carrapato();		
        
		if(acao) {
			return c.nomeCarrapato();
		}else {
		    c.tirarCarrapato();
		    return "";
		}   
	}

	public static void main(String[] args) {
		Cachorro cao = new Cachorro();

		System.out.println("Nome do cão: "+cao.name+"\n");
		
		System.out.println("Raça: "+cao.raca+"\n");

		System.out.println("o cão vai latir: ");
		cao.latir();

		System.out.println("Qual a espécie do carrapato? ");
		System.out.println(cao.getCarrapato(true));

		System.out.println("Tirarando carrapato do cão..... \n");
		System.out.println(cao.getCarrapato(false));
		
	}
}
