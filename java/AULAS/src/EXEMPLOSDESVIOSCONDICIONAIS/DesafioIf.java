package EXEMPLOSDESVIOSCONDICIONAIS;

import java.util.Scanner;

public class DesafioIf {
	public static void main(String args []){
		Scanner ler= new Scanner(System.in) ;
		int idadeNadador;
		System.out.println("Digite a idade do nadador :");
		idadeNadador = ler.nextInt();
		if(idadeNadador <5 5){
			System.out.println("Infelizmente não podemos vender");
		}
		else if(idadeNadador <= 7){
			System.out.println("Infantil A = 5 a 7 anos\n");
			
	}
		else if(idadeNadador <= 11){
			System.out.println("Infantil  = 8 a 11 anos\n");
			
	}
		else if(idadeNadador <= 13){
			System.out.println("Juvenil A = 12 a 13 anos");
			
	}
		else if(idadeNadador <= 17){
			System.out.println("Juvenil B = 14 a 17 anos");
			
	}
		else{
			System.out.println("Adultos = Maiores de 18 anos\n ");
			
	}
		System.out.println("Obrigado pela preferência Volte Sempre! ");
	}
}

