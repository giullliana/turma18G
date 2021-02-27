programa
{
//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, se é positivo ou negativo.

	
	funcao inicio()
	{
		inteiro numero =0 
		escreva("Digite um numero inteiro : ")
		leia(numero)

		se (numero >= 0){
			escreva("O numero digitado é positivo \n")
			
			}
			senao se (numero < 0){
				escreva("O numero digitado é negativo\n")
				}
		se ((numero%2)== 0){
			escreva("o numero é par \n")
			}
		senao {
			escreva("o numero é impar")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */