package OBJETO;

import java.util.Scanner;

public class BASEALTURA {
	public static void main(String[] args) {
		int baseTri1=0;
		int baseTri2=0;
		int baseTri3=0;
		int alturaTri1=0;
		int alturaTri2=0;
		int alturaTri3=0;
		int maiorTriangulo =0;
		int areaTriangulo1 =0;
		int areaTriangulo2=0;
		int areaTriangulo3=0;
		
		Scanner ler =new Scanner(System.in);
		
		System.out.printf("Digite a base do Triangulo 1 :");
		baseTri1=ler.nextInt();
		System.out.printf("\nDigite a base do Triangulo 2 :");
		baseTri2=ler.nextInt();
		System.out.printf("\nDigite a base do Triangulo 3 :");
		baseTri3=ler.nextInt();
		System.out.printf("\nDigite a altura do Triangulo 1 :");
		alturaTri1=ler.nextInt();
		System.out.printf("\nDigite a altura do Triangulo 2 :");
		alturaTri2=ler.nextInt();
		System.out.printf("\nDigite a altura do Triangulo 3 :");
		alturaTri3=ler.nextInt();
		areaTriangulo1=baseTri1*alturaTri1/2;
		areaTriangulo2=baseTri2*alturaTri2/2;
		areaTriangulo2=baseTri2*alturaTri2/2;
		if(areaTriangulo1> areaTriangulo2 && areaTriangulo1> areaTriangulo3) {
				maiorTriangulo= areaTriangulo1;
		}
				if(areaTriangulo2> areaTriangulo1 && areaTriangulo2> areaTriangulo3) {
				maiorTriangulo= areaTriangulo2;
				}
				if(areaTriangulo3> areaTriangulo2 && areaTriangulo3> areaTriangulo3) {
				maiorTriangulo= areaTriangulo3;
				}
				System.out.printf("O calculo da área total do Triangulo 1 é :" +areaTriangulo1);
				System.out.printf("\nO calculo da área total do Triangulo 2 é :" +areaTriangulo2);
				System.out.printf("\nO calculo da área total do Triangulo 3 é :" +areaTriangulo3);
				System.out.printf("\nPortanto o triangulo de maior área é :"+maiorTriangulo);
		}		
	}


