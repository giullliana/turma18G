import java.util.Scanner;

public class ex2Certo {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		Scanner ler = new Scanner(System.in);
		int par = 0, impar = 0;
		for (int x = 0; x < 10; x++) {
			System.out.print("Escreva o " + (x + 1) + "o numero");
			int numero;
			numero = ler.nextInt();
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " � PAR ");
				par++;
			} else {
				System.out.println("O numero " + numero + " � IMPAR ");
				impar++;
			}

		}
		System.out.println("Voc� digitou : " + par + " numeros  pares e " + impar + " numeros �mpares");

	}

}
