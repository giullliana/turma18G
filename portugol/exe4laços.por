programa
{
	
	funcao inicio()
	{
// Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
inteiro numero
escreva("Digite um numero inteiro :")
leia(numero)
		se(numero>=0){
escreva("o numero e positivo")

}
senao se (numero<0){
	escreva("o numero e negativo")
	
}se((numero%2) ==0){
      	escreva ("O número informado é par")
      	
      }
      senao {
      	escreva("O numero informado e impar")
      	
      }
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */