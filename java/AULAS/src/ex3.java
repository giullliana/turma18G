import java.util.Scanner;

public class ex3 {
	public static void main(String arg[]) {
		Scanner ler = new Scanner(System.in);
		int horas,minutos,segundos,tempoDura�ao;
		System.out.println("Digite o tempo de dura��o em segundos :");
			tempoDura�ao =ler.nextInt();
			horas = tempoDura�ao / 3600;
					minutos = (tempoDura�ao % 3600) / 60;
					segundos = (tempoDura�ao % 3600) % 60;

			
			System.out.printf(" O evento teve a dura��o de Horas:" + horas + "minutos :" + minutos + " e segundos " + segundos );
			
			
			
			
		
		
	}
	}

