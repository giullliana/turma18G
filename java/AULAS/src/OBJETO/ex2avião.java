package OBJETO;

public class ex2avi�o {

	public static void main(String[] args) {
		System.out.print("O que � necess�rio para um avi�o decolar?");
		Avi�o giulliana = new Avi�o(" Asa "," Turbina "," Tripula��o ");
		System.out.print(giulliana.decolar());
		System.out.print("\nO que � necess�rio para um avi�o pousar?");
		Avi�o casa= new Avi�o(" Desacelerar"," Freio "," Pista ");
		System.out.print(casa.decolar());
	}

}
