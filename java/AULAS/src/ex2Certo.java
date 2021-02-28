import java.util.Scanner;

public class ex2Certo {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		Scanner ler = new Scanner(System.in);
		int par = 0, impar = 0;
		for (int x = 0; x < 10; x++) {
			System.out.print("Escreva o " + (x + 1) + "o numero");
			int numero;
			numero = ler.nextInt();
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " é PAR ");
				par++;
			} else {
				System.out.println("O numero " + numero + " é IMPAR ");
				impar++;
			}

		}
		System.out.println("Você digitou : " + par + " numeros  pares e " + impar + " numeros ímpares");

	}

}
