package OBJETO;

public class ex4Funcionario {

	public static void main(String[] args) {
		System.out.print("Qual � o nome, a profiss�o, a idade e o sal�rio do Participante?");
		Funcionario pessoa1 = new Funcionario("\nGiulliana","Costureira",28,1000.00);
				System.out.print(Funcionario.trabalhador());
				System.out.print("\nQual � o nome, a profiss�o, a idade e o sal�rio do Participante 2?");
				Funcionario pessoa2 = new Funcionario("\nMaria","Medica",54,10.541);
						System.out.print(Funcionario.trabalhador());
		
	}

}
