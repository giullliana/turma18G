package FUNCOES;

import java.util.Scanner;

public class negativo {
	
			public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
						int numero;
						String numeroMaior;
			System.out.print("Digite um numero até acertar :");
			numero=ler.nextInt();
			num(numero);
			
		}
	private static void num(int numero) {
							
		for(int x=0 ; x<numero ; x++) {
		
			System.out.print("O maior numero é :" + numero);
			
		}
	}
	}


}
