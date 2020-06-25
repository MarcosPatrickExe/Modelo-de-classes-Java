package classes_wrappers;

class primitivosWrappers {

	// static void modelo() {
	//tipos primitivos:
	static short n1 =1;
	static byte n2 = 10;
	static int n3 = 100;
	static long n4 = 1000;
	static float n5 = 3.5f;
	static double n6 = 3.5555;
	static boolean flag = false;
	static char a ='a';
	//}

	public static void main(String[] args){
		//Classes Wrappers dos tipos primitivos:
		Byte n8 = new Byte((byte)1);       //OU Byte n8 = new Byte("1");
		Short n7 = new Short((short)1); //o numero 1 é do tipo int, por isso deve-se convertê-lo pra short ou byte
		Integer n9 = new Integer(100);     //OU Integer n9 = new Integer("100");
		Long n10 = new Long (10001);       //OU Long n10 = new Long ("10001");
		Float n11 = new Float(3.5f);       //OU Float n11 = new Float("3.5f");
		Double n12 = new Double(3.5555);   //OU Double n12 = new Double("3.5555");
		Boolean flag2 = new Boolean (true);//OU Boolean flag2 = new Boolean ("true");
		Character aa = new Character('a'); //OU Character aa = new Character("a"); 
		
		n1 = n8.shortValue();
		n1 = n8.byteValue();
		n3 = n9.intValue(); //converte para int
		n4 = n9.longValue(); //converte de Integer para long
		n6 = n11.doubleValue(); //converte de Float p/ double

		n3 = Integer.parseInt("100000"); //converte para int
		n6 = Double.parseDouble("1.5");  //converte para double

		n9 = Integer.valueOf(1343); //converte de int para Integer 


		/*autoboxing: é quando o objeto da classe wrapper é capaz de receber variáveis primitivas,
      exemplo:   */
		int num1 =10; 	

		Integer n20 = new Integer("100"); //OU (100) OU ((int) 100)
		n20 = num1;
        System.out.println("Valor de Integer n20 recebeu 10, n20 vale "+n20);
		/*autounboxing: é quando as variávei primitiva é capaz de receber o objeto da classe wrapper,
      exemplo:   */

		Integer n22 = new Integer(1000); //OU (100) OU ((int) 100)

		int num = n22; //OU
     // int num2 = n22.intValue();
		
		System.out.println("Valor de num n22 recebeu 1000, n22 vale "+num);
		
	}
}
