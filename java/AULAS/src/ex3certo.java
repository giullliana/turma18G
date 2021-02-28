import java.util.Scanner;

public class ex3certo {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas
		// com menos de 21 anos. Total de pessoas com mais de 50 anos.
		// O programa termina quando idade for =99. (WHILE)
		int idade = 99;
		int menos21 = 0;
		int maisde50 = 0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.print("Me informe sua idade : ");
			idade = ler.nextInt();
			if (idade < 21) {
				menos21++;
			}
			else if (idade > 50) {
				maisde50 ++;
			}
			
		}while (idade != 99);
		System.out.println("O total de pessoas menores de 21 anos é : " +
		menos21 + " O total de pessoas com mais  de 50 anos é :" 
				+ maisde50 );
	}

}
