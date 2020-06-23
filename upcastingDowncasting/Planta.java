package upcastingDowncasting;

public class Planta {
     private String nomePlanta;
     private String tipo;
     
     public Planta(String n, String t){
    	 this.nomePlanta = n;
    	 this.tipo = t;
     }
     
     public Planta() {}
     
     public String getNomePlanta() {
    	 return nomePlanta;
     }
     
     public void setNomePlanta(String n) {
    	 this.nomePlanta = n;
     }
     
     public String getTipo() {
    	 return tipo;
     }
     
     public void setTipo(String t) {
    	 this.tipo = t;
     }
     
     void exibirDados() {}
     
     void pegarFruto() {}
}
