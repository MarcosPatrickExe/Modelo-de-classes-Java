package string;

import java.util.Arrays;
import java.util.StringTokenizer;

class usandoStrings {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String a = new String();
		a="ol�"; //primeira forma de inicializar
		
		String b = new String("ol�"); //segunda forma de inicializar
		
		String c = new String(a); //terceira forma de inicializar
		
        char[] abc = {'A','B','C','D','E','F'};
        System.out.println( new String(abc, 0,3)); //esse construtor recorta o array da posi��o 0 � 3
        
        byte[] ascii = {65, 66, 67, 68, 69};
        
        System.out.println( new String (ascii));
        
        //-------------------------------CONCATENA��O-------------------------------------------------------
        System.out.println("\n Concatena��o \n");
        
        String nome = "jo�o";
        String sobrenome ="filho";
        System.out.println(nome+sobrenome);
        
        String concatenacao2 = "Lorem Ipsum is simply dummy text of the printing and typesetting";
        concatenacao2 += " industry. Lorem Ipsum has been the industry's standard dummy text ever since ";
        concatenacao2 += "the 1500s, when an unknown printer took a galley of type and scrambled it to make ";
        concatenacao2 += "a type specimen book. It has survived not only five centuries, but also the leap ";
        concatenacao2 += "into electronic typesetting, remaining essentially unchanged. It was popularised ";
        concatenacao2 += "in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, ";
        concatenacao2 += "and more recently with desktop publishing software like Aldus PageMaker including ";
        concatenacao2 += "versions of Lorem Ipsum.";
        
        /* String s�o imut�veis! Ao fazer a concatena��o de uma String n�o estmos alterando o valor dela,
         apenas cria-se uma nova String e fazendo com que sua  refer�ncia aponte para uma nova! Portanto,
         as Strings criadas anteiormente e com refer�ncias inutilizadas tornam-se dispon�veis para o garbage 
         colector  */
       
        //---------------CharAt(), getChars(), getBytes(), toCharArray()-------------------------------------
        System.out.println("\n CharAt(), getChars(), getBytes(), toCharArray() \n");
        
        String java="java";
        for(int z=0;z<java.length();z++) {
        	 System.out.println(java.charAt(z));
        }
        
        char[] jar = new char[3];
        java.getChars(0, 3, jar, 0); //pega os tr�s primeiros caracteres e os envia para 'jav'
        //seria o mesmo que:
        for(int j=0; j<3 ;j++) {
       	 jar[j]=java.charAt(j);
       	 System.out.println(jar);
       }
        
        byte[] byt = new byte[3];
        java.getBytes(0,3,byt,0);
        System.out.println(Arrays.toString(byt)); //converte todos os valores de 'byt' para String
        //a sa�da vai ser os c�digos(n�meros) de cada carctere passado
        
        char[] javaChars = java.toCharArray(); //converte uma String em um array de chars
        
      //----------equalsIgnoreCase(), regionMatches(), startswith(), endswith(), compareTo()--------
        System.out.println("\n equalsIgnoreCase(), regionMatches(), startswith(), endswith(), compareTo() \n");
        
        String ola ="Ol�", ola2="OLA", ola3="Ol�";
        System.out.println(ola.equals(ola2)); //o equals() diferencia caixa alta de baixa, retornando false
        System.out.println(ola.equals(ola3)); //false
        
        System.out.println(ola.equalsIgnoreCase(ola2)); //esse n�o diferencia caixa alta de baixa, retornando true
        
        String banana ="banana", ana="ana", ban="ban";
        System.out.println(banana.regionMatches(1, ana, 0, 3)); /* o primeiro n�mero faz refer�ncia ao segundo
        caractere de 'banana'; 'ana' ser� a vari�vel de compara��o; o 3� N� marca o inicio do intervalo que ser�
        utilizado para ver se ele existe em 'banana'; o 4� N� marca   */
        
        System.out.println(banana.endsWith(ana)); //verifica se banana termina com 'ana'
        System.out.println(banana.startsWith(ban)); //veirifica se banana inicia com 'ban'
        
        String aa="a", bb="b", aMaiusculo="A";
        
        System.out.println(a.compareTo(bb));   //exibe -1
        System.out.println(b.compareTo(a));    //exibe 1
        System.out.println(a.compareTo(a));    //exibe 0
        System.out.println(a.compareTo(aMaiusculo)); //exibe 32
        
        /* compareTo():
         * imprime -1 quando a>b   imprime 1 ou >1 quando a<b
         * imprime 0 quando a==b   
         * 
         * Ou seja, esse m�todo compara os tamanhos dos c�digos de cada caractere passado.
         * Ele � muito utilizado para compara��o e ordena��o de objetos.
         */
        
      //------------------------------indexOf(), lastIndexOf(), contains()--------------------------------
        System.out.println("\n indexOf(), lastIndexOf(), contains() \n");
        
        String melancia = "melancia";
        String lan ="lan";
        
        System.out.println(melancia.indexOf('x')); //retorna -1 porqu� n�o existe
        System.out.println(melancia.indexOf('b')); //retorna 0, j� que 'b' est� na 0� posi��o
        System.out.println(melancia.indexOf(lan)); //retorna 1, j� que 'lan' inicia a partir da 2� posi��o
        
        System.out.println(melancia.lastIndexOf('a')); //retorna 7, pois � nessa posi��o que 'a' se encontra
        //a partir do final da String !
        
        System.out.println(melancia.contains(lan)); //retorna true, melancia cont�m 'lan'
        
      //---------------------------substring(), concat(), replace(), trim()--------------------------------
        System.out.println("\n substring(), concat(), replace(), trim() \n");
        
        String teste ="isso � um teste";
        System.out.println(teste.substring(10)); //recorta a String a partir da 10� pos. retornando 
        //o resto dela
        System.out.println(teste.substring(10, 15)); //recorta a String a partir da 10� pos. at� a 
        //15�, retornando o intervalo
        
        String concatenando = melancia+lan; // OU:
        melancia.concat(lan); // o concat() concatena Strings
        
        concatenando = melancia.replace('i', 'a'); //replace() retira 'i' de mealncia e substitui por 'a'
        System.out.println(concatenando);
        
        concatenando = melancia.replaceAll("a", "we"); //replace() retira todoas os 'a' e substitui por 'w'
        System.out.println(concatenando);
        
        String frase = " meu nome � ";
        System.out.println(frase.trim());//trim() retira todos os espa�os antes e depois das frases!
        
      //---------------------------------------join(), split()----------------------------------------------
        System.out.println("\n join(), split() \n");
        
        String alfabeto = String.join(",", "A", "B", "C"); //join() adiciona a v�rgula entre cada caractere
        System.out.println(alfabeto);
        
        String[] letras = alfabeto.split(","); //o split() separa a String em diversos peda�os a partir de
        //um demarcador, no caso a v�rgula, adicionado cada recorte em um vetor
        
        System.out.println(letras);
        
        String arquivo ="1;Ant�nio;30";
        String[] infos = arquivo.split(";");
     //   new Pessoa(infos[0], infos[1], infos[2]); <-- pode fazer isso
        
      //--------------------------------stringBuilder(), stringBuffer()--------------------------------------
        System.out.println("\n stringBuilder(), stringBuffer() \n");
        
        //forma sem stringBuffer
        alfabeto = null;
        
        for(String letra : letras)
           alfabeto += letra;
        
      //forma com stringBuffer
        StringBuffer sb = new StringBuffer();
        
        for(String letra : letras) {
          sb.append(letra); }
      
        alfabeto = sb.toString(); // OU: alfabeto = new String(sb);
        
        System.out.println(alfabeto);
        
        System.out.println(sb.reverse()); // exibi valores em ordem contr�ria
        
        StringBuilder sbb = new StringBuilder();
        
        for(String letra : letras) {
          sbb.append(letra); }
      
        alfabeto = sbb.toString(); // OU: alfabeto = new String(sbb);
        
        System.out.println(alfabeto);
        
        //o string buffer � o mais apropriado para se trabalhar com threads do que o stringBuilder, embora
        //ambos fa�am a mesma coisa
        
        
      //-----------------------------------------tokenizer()--------------------------------------------------
        System.out.println("\n tokenizer() \n");
        
        String teste2 = "antoinio;45 anos;empregado";
        StringTokenizer st = new StringTokenizer(teste);
        
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
        
        System.out.println(teste.toLowerCase()); //coloca todas as letras de uma String em minusc�la
        System.out.println(teste.toUpperCase()); //coloca todas as letras de uma String em mai�scula
        
	}

}
