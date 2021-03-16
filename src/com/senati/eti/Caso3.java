package com.senati.eti;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int num = a.nextInt();
		int sumatoria = 1, i = 2;
		
		if (num <= 7) {
			while(i < num + 1 ) {
				
				sumatoria = sumatoria * i ;
				i++;
			}
			System.out.println("El factorial de " + num + " es: " + sumatoria);
		}
		else
			System.out.println("El número es superior a 7");
		
	}

}
