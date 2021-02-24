import java.util.Scanner;

public class ex5 {
	public static void main(String arg[]) {
		Scanner ler = new Scanner(System.in);
		int p1=2,p2=3,p3=5;
		int media1,media2,media3,mediaFinal;
		System.out.println("Digite a media 1:");
		media1 = ler.nextInt();
		System.out.println("Digite a media 2:");
		media2 = ler.nextInt();
		System.out.println("Digite a media 3:");
		media3 = ler.nextInt();
		mediaFinal=((media1*2 +media2*3+media3*5)/(p1+p2+p3));
		System.out.printf("A média final do aluno é : " + mediaFinal);
		
		
		
	}
}
