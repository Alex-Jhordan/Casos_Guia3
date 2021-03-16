package com.senati.eti;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		int i = 1, num_mayor = 0, n = 0;
		
		while(i <= 4) {
			System.out.print("Ingrese número " + i + ": ");
			n = a.nextInt();
		
			if (n > num_mayor) num_mayor = n;
		
			i++;
		}
		
		System.out.print("El número mayor es: " + num_mayor);
	}

}
