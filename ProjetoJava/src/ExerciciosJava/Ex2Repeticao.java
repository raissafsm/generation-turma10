package ExerciciosJava;

import java.util.Scanner;

// 2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

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