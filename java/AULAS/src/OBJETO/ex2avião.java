package OBJETO;

public class ex2avião {

	public static void main(String[] args) {
		System.out.print("O que é necessário para um avião decolar?");
		Avião giulliana = new Avião(" Asa "," Turbina "," Tripulação ");
		System.out.print(giulliana.decolar());
		System.out.print("\nO que é necessário para um avião pousar?");
		Avião casa= new Avião(" Desacelerar"," Freio "," Pista ");
		System.out.print(casa.decolar());
	}

}
