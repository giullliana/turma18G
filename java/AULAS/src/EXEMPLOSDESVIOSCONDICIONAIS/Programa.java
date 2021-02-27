package EXEMPLOSDESVIOSCONDICIONAIS;
import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
System.out.println("Digite um número inteiro positivo");
    
    int numero = ler.nextInt();
    
    if (numero % 2 == 0) { // número é par
      System.out.println("O número digitado foi: " + numero + " e é PAR");
      System.out.println("A raiz quadrada é " + Math.sqrt(numero));
    } else { // número é impar
      System.out.println("O número digitado foi: " + numero + " e é ÍMPAR");
      System.out.println("O número elevado ao quadrado é " + Math.pow(numero, 2));
    }
  }
}