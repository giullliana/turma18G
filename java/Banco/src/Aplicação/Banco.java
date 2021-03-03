package Aplicação;

import java.util.Scanner;

import Classes.Conta;
import Classes.ContaEspecial;

public class Banco {

	public static void main(String[] args) {
		int numero = 0;
		String cpf = null;
		int tipoConta = 0;
		boolean ativa = false;
		Scanner ler = new Scanner(System.in);
		ContaEspecial contaMagica = null;
		String continuar = null;
		int operaçoes = 0;
		String[] movimentos = new String[10];
		String movimento = null;
		double valor = 0.00;
		// chamar a minha conta
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t\t\t     KIGBJ-G1 BANK ");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~* [Dê um Xeque-Mate na sua dor de cabeça] *~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t\t\t [1] Conta Poupança");
		System.out.println("\t\t\t [2] Conta Corrente");
		System.out.println("\t\t\t [3] Conta Especial");
		System.out.println("\t\t\t [4] Conta Empresarial");
		System.out.println("\t\t\t [5] Conta Estudantil");
		System.out.println("\t\t\t [6] Sair");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");

		tipoConta = ler.nextInt();
		if (tipoConta == 1) {
		} else if (tipoConta == 2) {
		} else if (tipoConta == 4) {
		}
		// Giulliana Munhoz //
		else if (tipoConta == 3) {
			System.out.println("\t\t\t Tipo de conta selecionada: Estpecial");
			System.out.println("\t\t\t Digite o número da sua conta:");
			numero = ler.nextInt();
			System.out.println("\t\t\t Digite o número do seu CPf:");
			cpf = ler.next();
			contaMagica = new ContaEspecial(numero, cpf, true, 1000.00);

		} else if (tipoConta == 6) {
			System.out.println("\t\t\t Operação encerrada.");
			return;
		}
		do {
			System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			System.out.println("\t\t\t     KIGBJ-G1 BANK ");
			System.out.println();
			System.out.println(
					"\t*~*~*~*~*~*~*~*~*~*~*~* [Dê um Xeque-Mate na sua dor de cabeça] *~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			System.out.println("Conta Especial");
			System.out.println("Saldo " + contaMagica.getSaldo());
			System.out.println("MOVIMENTO - D-debito ou C-Crédito: ");
			movimento = ler.next();
			System.out.println("Valor movimento: R$  ");
			valor = ler.nextDouble();
			if (movimento.equalsIgnoreCase("C")) {
				contaMagica.credito(valor);
				movimentos[operaçoes] = "Crédito " + valor;
			} else {
				contaMagica.debito(valor);
				movimentos[operaçoes] = "Débito " + valor;
			}
			operaçoes = operaçoes + 1;
			System.out.println("Continuar S/N:");
			continuar = ler.next();

		} while (continuar.equalsIgnoreCase("S") && operaçoes < 10);
		System.out.println(movimentos);
	}

}
