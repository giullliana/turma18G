package OBJETO;

public class Ex1 {

	public static void main(String[] args) {
		CLIENTE giulliana = new CLIENTE("Giulliana","Munhoz ,","Desenvolvedora");
		CLIENTE cliente2 = new CLIENTE("\nCamila","Sem Defeitos ,","Dev/Professora");
		CLIENTE cliente3 = new CLIENTE("\nLiza","Perfeita ,","Dev/Professora");
		CLIENTE cliente4 = new CLIENTE("\nEd","Íncrivel ,","Mestre do Java");
		System.out.print(giulliana.nomeEprofissão());
		System.out.print(cliente2.nomeEprofissão());
		System.out.print(cliente3.nomeEprofissão());
		System.out.print(cliente4.nomeEprofissão());
		
		
	}

}
