package EXEMPLOSDESVIOSCONDICIONAIS;

import java.util.Scanner;

public class PARIMPAR 
{
public static void main(String args []){
	int numero = 0;
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite um numero positivo :");
	numero = ler.nextInt();
	if (numero%2 == 0) {
		System.out.println("O número "+ numero +" é Par");
	}
	else
	{
		System.out.println("O número :" + numero + "  é Impar");	
	}
	
}
}

