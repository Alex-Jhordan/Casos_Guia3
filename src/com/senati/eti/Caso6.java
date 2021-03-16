package com.senati.eti;
import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		int nr = 0, edad = 0, aptos = 0;
		String nombre = "", estado = "", continuar = "S";
		
		while (continuar.equals("S")) {
			nr++;
			
			System.out.println("R e g i s t r o " + nr);
			
			System.out.print("Nombre del participante: ");
			nombre = a.nextLine();
			
			System.out.print("Edad del participante: ");
			edad = a.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				aptos++;
			}
			else
				estado = "Menor de edad";
			
			System.out.println("Estado: " + estado);
			
			a.nextLine();
			
			
			
			System.out.print("¿Desea registrar otro participante [S/N]? ");
			continuar = a.nextLine();
			
		}
		
		System.out.println("RESUMEN");
		System.out.println("=======");
		System.out.println("Participantes registrados : " + nr);
		System.out.println("Cantida de participantes aptos para votar : " + aptos);
	}

}
