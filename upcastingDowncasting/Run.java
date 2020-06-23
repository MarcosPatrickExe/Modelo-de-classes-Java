package upcastingDowncasting;

public class Run {

	public static void main(String[] args) {
		
		 //Planta planta = new Gimnospermas(); primeira forma de upcasting
		 //Planta planta = (Planta) new Gimnospermas(); segunda forma de upcasting
         
         
		 Gimnospermas gim = new Gimnospermas();
         gim.setNomePlanta("pinheiro");
         gim.setTipo("pinhas");
         gim.setCor("verde"); 
         
         Planta pla = (Planta) gim; // terceiro forma de upcasting
         pla.exibirDados();
         
	   /*	 
         veg = (Vegetal) new Planta("tomate", "verdura"); //primeira forma de downcasting
         veg.setCor("vermelho");
         System.out.println("Valor de veg: "+veg.getNomePlanta()+" "+veg.getTipo()+" "+veg.getCor());
         
        /* Planta p = new Planta();
         veg = (Vegetal) p; //segunda forma de downcasting */
	}

}
