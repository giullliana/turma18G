package OBJETO;
// Crie uma classe produto eletrônico e apresente os atributos e métodos 
//referentes esta classe, em seguida crie um objeto produto eletrônico, defina
//as instancias deste objeto e apresente as informações deste objeto no console.

public class Produtoeletronico {
	public static String comFio;
	public static Object acimaDe100=0;
	public static double preço=0.0;
	

public Produtoeletronico(String parte1,Object parte2,double parte3) {
	comFio= parte1;
	acimaDe100 =parte2;
	preço=parte3;
}


public Produtoeletronico(String parte1, String parte2, double parte3) {
	// TODO Auto-generated constructor stub
	comFio= parte1;
	acimaDe100 =parte2;
	preço=parte3;
}


public static String barato() {
	String barato = comFio+" "+acimaDe100+" "+preço;
	return barato;
	 	  
}
}

	
	
