package ExerciciosJava;

// 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
// dias e mostre-a expressa apenas em dias.

import java.util.Scanner;
public class Ex1IdadePessoa {
	
	public static void main(final String[] args)
 {
		int idadeAnos, idadeMeses, idadeDias, idadeTotal, diasAnos;
		
		Scanner myInput = new Scanner( System.in );		
		System.out.println("Digite quantos anos voc� tem");
		idadeAnos = myInput.nextInt();
	
		System.out.println("Digite quantos meses voc� tem");
		idadeMeses = myInput.nextInt();
		
		System.out.println("Digite quantos dias voc� tem");
		idadeDias = myInput.nextInt();
		
		idadeTotal = idadeAnos*365 + idadeMeses*30 + idadeDias;
		System.out.println("Sua idade total em dias ser�: " + idadeTotal
				);
		
		
 }	
	}