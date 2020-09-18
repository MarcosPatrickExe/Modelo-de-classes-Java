package enum_classe;

 enum DiaSemana {
	 SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);	
	 
	 int valor;
	 DiaSemana(int val){
		 valor = val;
	 }
	 
	 int getValor() {
		 return valor;
	 }
	 
	 enum nomes{
		 JOAO, MATEUS, VITOR, MIGUEL		 
	 }
}
