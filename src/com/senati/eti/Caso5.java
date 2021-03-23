package com.senati.eti;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		int i = 1, num_menor = 0, n = 0;
		
		while(i <= 5) {
			System.out.print("Ingrese número " + i + ": ");
			n = a.nextInt();
			
			if (i == 1)
				num_menor = n;
			else if (n < num_menor) num_menor = n;
		
			i++;
		}
		
		System.out.print("El número menor es: " + num_menor);
	}

}
