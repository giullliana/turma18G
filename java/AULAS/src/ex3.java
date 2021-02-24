import java.util.Scanner;

public class ex3 {
	public static void main(String arg[]) {
		Scanner ler = new Scanner(System.in);
		int horas,minutos,segundos,tempoDuraçao;
		System.out.println("Digite o tempo de duração em segundos :");
			tempoDuraçao =ler.nextInt();
			horas = tempoDuraçao / 3600;
					minutos = (tempoDuraçao % 3600) / 60;
					segundos = (tempoDuraçao % 3600) % 60;

			
			System.out.printf(" O evento teve a duração de Horas:" + horas + "minutos :" + minutos + " e segundos " + segundos );
			
			
			
			
		
		
	}
	}

