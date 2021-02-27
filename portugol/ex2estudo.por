programa
{
//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

	
	funcao inicio()
	{
		inteiro anos=0
	inteiro meses=0
	inteiro dias =0
		escreva("Qual é a sua idade em dias vividos até hoje :  \n")
		leia(dias)
		meses =((dias%365)/12)
		anos = dias/365
		escreva("A sua idade em meses vividos é  de  " , meses ,"meses"," e você possui  : ",anos ," anos de idade")
		
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */