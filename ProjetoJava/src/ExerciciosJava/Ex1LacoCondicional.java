package ExerciciosJava;

import java.util.Scanner;

// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Ex1LacoCondicional {
	public static void main (String args [])
	{
		Scanner myInput = new Scanner( System.in );
		int x, y, z;
		
		System.out.println("\nEntre com o primeiro valor:");
		x = myInput.nextInt();
		
		System.out.println("\nEntre com o segundo valor:");
		y = myInput.nextInt();
		
		System.out.println("\nEntre com o terceiro valor:");
		z = myInput.nextInt();
		
		if (x >= y && x > z) {
			System.out.println("\nO número maior é:");
			System.out.println(x);
		}
		
		else if (y >= z && y > x) {
			System.out.println("\nO número maior é:");
		}
		
		else if (z >= x && z > y) {
			System.out.println("\nO número maior é:");
		}
		{
		
		}
		myInput.close();
	
}

}