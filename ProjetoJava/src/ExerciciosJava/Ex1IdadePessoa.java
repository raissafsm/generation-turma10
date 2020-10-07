package ExerciciosJava;

// 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
// dias e mostre-a expressa apenas em dias.

import java.util.Scanner;
public class Ex1IdadePessoa {
	
	public static void main(final String[] args)
 {
		int idadeAnos, idadeMeses, idadeDias, idadeTotal, diasAnos;
		
		Scanner myInput = new Scanner( System.in );		
		System.out.println("Digite quantos anos você tem");
		idadeAnos = myInput.nextInt();
	
		System.out.println("Digite quantos meses você tem");
		idadeMeses = myInput.nextInt();
		
		System.out.println("Digite quantos dias você tem");
		idadeDias = myInput.nextInt();
		
		idadeTotal = idadeAnos*365 + idadeMeses*30 + idadeDias;
		System.out.println("Sua idade total em dias será: " + idadeTotal
				);
		
		
 }	
	}