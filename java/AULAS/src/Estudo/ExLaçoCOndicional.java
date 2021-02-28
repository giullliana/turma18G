package Estudo;

import java.util.Scanner;

public class ExLaçoCOndicional {
	public static void main(String[] args) {

	Scanner  ler =new Scanner(System.in);
	int idade; 
    String nome;
    System.out.println("Entre com o seu nome :");
	nome = ler.nextLine();
	System.out.println("Entre com a  sua idade :");
	idade = ler.nextInt();
if (idade>=18) {
	System.out.print("Você é maior de Idade\n");
}
else if( idade>=1 && idade<18) {
System.out.print("Você é menor de idade");
}
else {
	System.out.print("Você digitou um dado inválido");
	
}
}




}
