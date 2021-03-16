package com.senati.eti;
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);

		System.out.print("Ingrese número: ");
		int n = a.nextInt();
		
		int i = 1, sumatoria = 0;
		
		while (i <= n) {
			sumatoria += i;
			
			if (i < n)
				System.out.print(i + " + ");
			else
				System.out.println(i + " = " + sumatoria);
			i++;
			
		}
	
	}

}