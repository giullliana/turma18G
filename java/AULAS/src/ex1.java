import java.util.Scanner;

public class ex1 {
public static void main(String arg[]) {
	Scanner ler = new Scanner(System.in);
	int anos,meses,diasTotal;
	System.out.println("Qual a sua idade em anos?");
		anos =ler.nextInt();
		System.out.println("Qual a sua idade em meses?");
		meses =ler.nextInt();
		
		System.out.printf("Sua idade em dias vividos é de:"+(anos*365)+(meses*12));
		
		
		
	
	
}
}

