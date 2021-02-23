programa
{
	
	funcao inicio()
	{
	      real P,M,E
	      real limite = 50.0
	      real multaPorKg = 4.00
	      escreva("informe o numero de kg adquiridos :")
	      leia(P)
	      E= P
	      M= multaPorKg * E
	      

		
		se (P > limite){
			escreva("voce excedeu a quantidade de :",E , "kilos")
			escreva("portanto deve" , M ,"reais ao estado de sao paulo")
			retorne
			
		}
				
		escreva("voce nao excedeu a pesagem de sao paulo")
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