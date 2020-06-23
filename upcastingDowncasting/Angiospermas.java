package upcastingDowncasting;

public class Angiospermas extends Planta{

	private String cor;

	public Angiospermas(String n, String t) {
		super(n, t);
	}

	public Angiospermas() {}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	void exibirDados() {
		System.out.println("Nome da planta: "+super.getNomePlanta()+""
				+ "Tipo da planta: "+super.getTipo()+""
				+"Cor da planta: "+this.getCor());
		pegarFruto();
	}

	@Override
	void pegarFruto() {
		System.out.println("Fruto recebido");
	}
}
