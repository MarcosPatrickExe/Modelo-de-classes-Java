package classes_interna_local_anonima;

interface TextoInterface {
	  public static final int ANO = 2020;
	  public static final String tipoTexo = "UpperCase";
	
      public abstract void imprimeTexto();
      public abstract void editarTexto();
      public abstract int numeroCaracteres(String t);
      public abstract String simbolos();
}
