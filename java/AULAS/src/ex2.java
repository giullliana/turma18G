import java.util.Scanner;

public class ex2 {
public static void main(String arg[]) {
	Scanner ler = new Scanner(System.in);
	int dias,meses,anos;
	System.out.println("Qual a sua idade em dias vividos?");
		dias =ler.nextInt();
		meses =(dias%365)/12;
				anos = dias/365;
		
		System.out.printf("Sua idade em dias vividos é de:" + dias + "já em meses vividos é de :" + meses + " e você possui " + anos );
		
		
		
		
	
	
}
}

