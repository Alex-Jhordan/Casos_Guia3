package com.senati.eti;
import java.util.Scanner;
public class Caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = a.nextInt();
		
		System.out.println("\nTABLA DEL " + n);
		System.out.println("===========");
		
		for(int i = 1; i <= 15; i++)
			System.out.println(n + " x " + i + " = " + (n * i));
	}

}
