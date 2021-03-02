package OBJETO;

public class ex4Funcionario {

	public static void main(String[] args) {
		System.out.print("Qual é o nome, a profissão, a idade e o salário do Participante?");
		Funcionario pessoa1 = new Funcionario("\nGiulliana","Costureira",28,1000.00);
				System.out.print(Funcionario.trabalhador());
				System.out.print("\nQual é o nome, a profissão, a idade e o salário do Participante 2?");
				Funcionario pessoa2 = new Funcionario("\nMaria","Medica",54,10.541);
						System.out.print(Funcionario.trabalhador());
		
	}

}
