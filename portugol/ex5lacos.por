programa
{
	funcao inicio()
	{
		real indicePoluicao
		escreva("digite o indice de poluicao :")
		leia(indicePoluicao)
se(indicePoluicao>= 0.3 e indicePoluicao < 0.4){
	escreva("industrias do 1º grupo suspendem atividade")
	
}
senao se(indicePoluicao >= 0.4 e indicePoluicao < 0.5){
	escreva("industrias do 1º e 2º grupo suspendem atividades")
	
}
senao se (indicePoluicao >= 0.5 ){
	escreva("industrias de todos os grupos são intimadas a paralisarem suas atividades")
}
	senao {
		escreva("indice invalido")
	}




		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */