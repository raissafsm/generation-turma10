programa
{
	
	funcao inicio()
	{
		//Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
		// três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
		// digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135. 

		 inteiro valor

		 escreva("Digite um valor: ")
		 leia(valor)

		 enquanto (valor <= 100){

			valor = valor * 3

			escreva("\n", valor, "\n")

		 }	 		 	 	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = 17, 19, 10, 12, 13;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */