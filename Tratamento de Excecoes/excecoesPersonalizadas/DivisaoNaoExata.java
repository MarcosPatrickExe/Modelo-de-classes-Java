package excecoesPersonalizadas;

public class DivisaoNaoExata extends Exception{
    protected int num;
    protected int den;
	
	public DivisaoNaoExata(int n, int d){
		this.num = n;
		this.den = d;
		
		exibir();
	}
	
	public void exibir() {
		System.out.println("Resultado de "+num+"/"+den+" não é inteiro!");
	}
     		
}
