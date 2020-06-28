package heranca.e.polimorfismo;

public class Testar {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		Aluno alu = new Aluno();
		Professor pro = new Professor();
		
	    alu.setEndereco("Rua 093, numero 200");
		pro.setEndereco("Rua 093, numero 200");

		Pessoa pes1 = alu;
		Pessoa pes2 = pro;
        
		//OU:
		/*Pessoa pes1 = new Aluno("Rua 093, numero 200");
		  Pessoa pes2 = new Professor("Rua 093, numero 200");
          */

		System.out.println(pes1.obterEtiquetaDeEndereco());
		System.out.println(pes2.obterEtiquetaDeEndereco());

	}
}
