package ExerciciosJava;

import java.util.Scanner;

// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

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
			System.out.println("\nO n�mero maior �:");
			System.out.println(x);
		}
		
		else if (y >= z && y > x) {
			System.out.println("\nO n�mero maior �:");
		}
		
		else if (z >= x && z > y) {
			System.out.println("\nO n�mero maior �:");
		}
		{
		
		}
		myInput.close();
	
}

}