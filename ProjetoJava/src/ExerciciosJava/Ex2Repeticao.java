package ExerciciosJava;

import java.util.Scanner;

// 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Ex2Repeticao {
	
	public static void main(String[] args) {

		int y; 
		
		for ( y=1000;y<=1999; y++) {
			if (y%11==5) 
			{
				System.out.println(y);
			}
		}
	}
}