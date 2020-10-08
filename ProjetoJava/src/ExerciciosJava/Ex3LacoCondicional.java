package ExerciciosJava;

import java.util.Scanner;

// 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
// categoria ela se encontra.


public class Ex3LacoCondicional {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		
		int idade;
				
		System.out.printf("Digite a idade: ");
		idade = myInput.nextInt();
				
				
		if(idade >= 10 && idade <= 14){
			System.out.println("\nCategoria: Infantil");
		} 
		else if(idade >= 15 && idade <= 17){
			System.out.println("\nCategoria: Juvenil ");
		}
		else if(idade >= 18 && idade <= 25){
			System.out.println("\nCategoria: Adulto");
		}
		else{
			System.out.println("\nIdade não aceita pelo sistema, tente novamente!");
		}
		
		myInput.close();

	}

}