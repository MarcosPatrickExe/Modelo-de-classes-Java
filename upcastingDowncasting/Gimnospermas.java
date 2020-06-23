package upcastingDowncasting;

public class Gimnospermas extends Planta{
	
	private String cor;
	
    public Gimnospermas(String n, String t) {
		super(n, t);
	}
    
    public Gimnospermas() {}

	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
    
	@Override
	void exibirDados() {
   	 System.out.println("Nome da planta: "+super.getNomePlanta()+"\n"
   	 		          + "Tipo da planta: "+super.getTipo()+"\n"
   	 		          +"Cor da planta: "+this.getCor());
   	System.out.println();
    	pegarFruto();
    }
	
	@Override
	void pegarFruto() {
    	System.out.println("Gimnospermas não produz frutos!");
    }
	
}
