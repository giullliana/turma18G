package EXEMPLOSDESVIOSCONDICIONAIS;

import java.util.Scanner;

public class ex1 {
	
		public static void main(String args []){
			Scanner ler= new Scanner(System.in) ;
			int num1,num2,num3;
			System.out.println("Digite o 1� numero inteiro :");
			num1 = ler.nextInt();
			System.out.println("Digite o 2� numero inteiro :");
			num2 = ler.nextInt();
			System.out.println("Digite o 3� numero inteiro :");
			num3 = ler.nextInt();
			if(num3 < num1){
				System.out.println(num1);
			}
			else if(num2< num1){
				System.out.println(num2);
				
		}
			else if(num2 < num3){
				System.out.println(num3);
			}
			else if(num3< num1){
				System.out.println(num1);
				
		}
			else if(num1 < num2){
				System.out.println(num2);
			}
			else if(num1 < num3){
				System.out.println("o maior numero digitado � :"+num3);
			}
						else {
				System.out.println("O maior numero digitado �: "+ num3);
				num3=ler.nextInt();
			}
		}
}

