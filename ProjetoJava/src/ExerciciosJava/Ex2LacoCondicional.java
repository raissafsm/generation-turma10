package ExerciciosJava;

import java.util.Scanner;

// 2- Faça um programa que entre com três números e coloque em ordem crescente.

public class Ex2LacoCondicional {
	public static void main (String args [])
	{
		Scanner myInput = new Scanner( System.in );
		int a, b, c;
		
		System.out.println("\nEntre com o primeiro valor:");
		a = myInput.nextInt();
		
		System.out.println("\nEntre com o segundo valor:");
		b = myInput.nextInt();
		
		System.out.println("\nEntre com o terceiro valor:");
		c = myInput.nextInt();
		
		if (a <= b && a <= c) {
			if(b <= c) {
				System.out.printf("\nEm ordem crescente: %d; %d e %d", a, b, c);
			}
			else {
				System.out.printf("\nEm ordem crescente: %d; %d e %d", a, c, b);
			}
		}
		else if(b <= a && b <= c) {
			if (a <= c) {
				System.out.printf("\nEm ordem crescente: %d; %d e %d", b, a, c);
			}
			else {
				System.out.printf("\nEm ordem crescente: %d; %d e %d", b, c, a);
			}
		}
		else if(c <= a && c <= b) {
			if (a <= b) {
				System.out.printf("\nEm ordem crescente: %d; %d e %d", c, a, b);
			}
			else {
				System.out.printf("\nEm ordem crescente: %d; %d e %d", c, b, a);
			}
		}
		else {
			System.out.printf("\nEm ordem crescente: %d; %d e %d", a, b, c);
		}
		
		myInput.close();
	}

}
