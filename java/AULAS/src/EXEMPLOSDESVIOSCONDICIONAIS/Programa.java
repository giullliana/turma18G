package EXEMPLOSDESVIOSCONDICIONAIS;
import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
System.out.println("Digite um n�mero inteiro positivo");
    
    int numero = ler.nextInt();
    
    if (numero % 2 == 0) { // n�mero � par
      System.out.println("O n�mero digitado foi: " + numero + " e � PAR");
      System.out.println("A raiz quadrada � " + Math.sqrt(numero));
    } else { // n�mero � impar
      System.out.println("O n�mero digitado foi: " + numero + " e � �MPAR");
      System.out.println("O n�mero elevado ao quadrado � " + Math.pow(numero, 2));
    }
  }
}