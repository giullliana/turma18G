package OBJETO;
//crie uma classe funcion�rio 
//crie um objeto funcion�rio, defina as instancias deste objeto 
//e apresente as informa��es deste objeto no console.

public class Funcionario {
	public Funcionario(String nome, String profiss�o, int idade, double salario) {
		super();
		this.nome = nome;
		this.profiss�o = profiss�o;
		this.idade = idade;
		this.salario = salario;
	}
	public static String nome;
	public static String profiss�o;
	public static int idade =0;
	public static double salario=0.00;


public static String trabalhador() {
	String trabalhador = nome +" "+ profiss�o+" "+idade+" "+salario;
	return trabalhador;
	
	
}
}