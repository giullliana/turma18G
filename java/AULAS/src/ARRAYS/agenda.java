package ARRAYS;

import java.util.Scanner;

public class agenda {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
int dia= 0;
int hora =0;
int opçao =0;
int atividades =0;
String[][] agenda = new String [31][24];

String opção;
do {
System.out.printf("Digite o numero do dia [1-31]");
dia=ler.nextInt();

dia = dia - 1;
 System.out.printf("Digite o numero da hora [0-23]");
hora=ler.nextInt();

System.out.printf("Digite sua anotacao: ");
agenda[dia][hora]=ler.next();

System.out.printf("Desenja continuar? [1] - Sim / [0] - Nao");
opçao=ler.nextInt();
} while (opçao != 0); // para de executar se opcao for 0

for(int i = 0; i < agenda.length; i++) { // para cada dia na agenda
  for(int j = 0; j < agenda[i].length; j++) { // para cada hora no dia
    if (agenda[i][j] != null) { // se houver uma anotação
      System.out.println("Minhas anotacoes:Dia " + (i+1) + " as " + j + "h " + agenda[i][j]);
      atividades++; // incrementa o numero de atividades
    }
  }
}

System.out.println("Voce tem " + atividades + " atividade(s) este mes");
}
}