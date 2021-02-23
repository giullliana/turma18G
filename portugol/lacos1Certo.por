programa
{
	
	funcao inicio()
	{
inteiro P=0
real M= 0.00
inteiro E=0
 const inteiro LIMITE =50
 const real VALORMULTA=4.00

 escreva("Informe o peso de tomates hoje em kilos: ")
 leia(P)
 se (P <= LIMITE){
 	escreva("Excesso :" , E )
 	escreva("Multaa :", M )
 	
 }
 senao{
E = P - LIMITE
M = E*VALORMULTA
escreva("Excesso :", E )
escreva("Multa :" , M)
 }
 



	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */