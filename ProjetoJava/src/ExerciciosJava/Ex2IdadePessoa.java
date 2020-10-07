package ExerciciosJava;

// 2- Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
// expressa em anos, meses e dias.

import java.util.Scanner;
public class Ex2IdadePessoa {
	
	public static void main(final String[] args)
 {
		int idadeDias, idadeAnos, idadeMeses, totalDias, restoDias; 
		
		Scanner myInput = new Scanner( System.in );		
		System.out.println("Digite sua idade em dias:");
		totalDias = myInput.nextInt();

		idadeAnos = totalDias/365;
		restoDias = totalDias % 365;
		
		idadeMeses = restoDias/30;
		restoDias = restoDias%30;
		
		totalDias = restoDias;
		System.out.println("Anos:"+idadeAnos);
		System.out.println("Meses:"+idadeMeses);
		System.out.println("Dias:"+totalDias);

 }
	
}