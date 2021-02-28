package Estudo;

import java.util.Scanner;

public class exDoWhile {
	public static void main(String[] args) {
		

		Scanner  ler =new Scanner(System.in);
		int idade; 
	    System.out.println("Escreva sua idade :\n");
	 	idade = ler.nextInt();
	 do	
	 {
			if( idade>=18) {
	System.out.print("\n Você é maior de idade\n");
	}
	else {
		System.out.print("\n Você é menor de idade");
		
	}
	System.out.println("Escreva sua idade :\n");
		idade = ler.nextInt();
		
	}while (idade>=1);
		}



	}




