package heranca.e.polimorfismo;

public class Professor extends Pessoa{
 
    private String departamento;
    private String nomeCurso;
    private double salario;
	
    Professor(String endereco){
    	super.setEndereco(endereco);
    }
    
    Professor(){}
    
    public String getDepartamento() {
		return this.departamento;
	}
    
    public void setDepartamento(String departamento) {
	   this.departamento = departamento;
	}
    
    public String getNomeCurso() {
		return nomeCurso;
	}
    
    public void setNomeCurso(String nomeCurso) {
	   this.nomeCurso = nomeCurso;
	}
    
    public double getSalario() {
		return salario;
	}
    
    public void setSalario(double salario) {
	   this.salario = salario;
	}
    
    @Override
	public String obterEtiquetaDeEndereco() {
		String s = "Endereço do professor: ";
		s += this.getEndereco();
		return s;
	}
}
