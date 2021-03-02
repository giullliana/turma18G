package OBJETO;
//crie uma classe funcionário 
//crie um objeto funcionário, defina as instancias deste objeto 
//e apresente as informações deste objeto no console.

public class Funcionario {
	public Funcionario(String nome, String profissão, int idade, double salario) {
		super();
		this.nome = nome;
		this.profissão = profissão;
		this.idade = idade;
		this.salario = salario;
	}
	public static String nome;
	public static String profissão;
	public static int idade =0;
	public static double salario=0.00;


public static String trabalhador() {
	String trabalhador = nome +" "+ profissão+" "+idade+" "+salario;
	return trabalhador;
	
	
}
}