programa
{
//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

	
	funcao inicio()
	{
	inteiro anos=0
	inteiro meses=0
	inteiro dias =0
		escreva("Qual é a sua idade em anos :  \n")
		leia(anos)
		escreva("Qual é a sua idade em meses :  \n")
		leia(meses)
		dias = ((anos*365)+(meses*12))
		escreva("A sua idade em dias vividos é de : ",dias)

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */