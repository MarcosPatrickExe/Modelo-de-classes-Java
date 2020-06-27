package heranca.e.polimorfismo;

public class Aluno extends Pessoa {

	private String cursos;
	private int notas;
	
	Aluno(String endereco){
    	super.setEndereco(endereco);
    }
	
	Aluno(){}
	
	public String getCursos() {
		return this.cursos;
	}
	
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	
	public int getNotas() {
		return this.notas;
	}
	
	public void setNotas(int notas) {
		this.notas = notas;
	}
	
	@Override
	public String obterEtiquetaDeEndereco() {
		String s = "Endereço do aluno: ";
		s += this.getEndereco();
		return s;
	}
}
