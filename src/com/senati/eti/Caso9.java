package com.senati.eti;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		DecimalFormat b = new DecimalFormat("#.00");
		
		String continuar = "S", estado = "", nombre2 = "", nombre3 = "";
		int registro = 0, nota = 0, i =1, certificados = 0, sin_certificado = 0;
		float promedio = 0, promedio_mayor = 0, promedio_menor = 0;
		
		while (continuar.equals("S")) {
			
			registro++; 
			
			System.out.println("------------------");
			System.out.println("R E G I S T R O - " + registro);
			System.out.println("------------------");
			System.out.print("Nombre de alumno: ");
			String nombre = a.nextLine();
			
			while (i < 4) {
				System.out.print("Nota " + i + ": ");
				nota = a.nextInt();
				if (i == 1) 
					promedio += nota * 0.20f;
				else if (i == 2)
					promedio += nota * 0.30f;
				else if (i == 3)
					promedio += nota * 0.50f;
				i++;
			}
			
			System.out.print("Asistencia [1-12]: ");
			float asistencia = a.nextInt();
			
			asistencia = (asistencia * 100) / 12 ;
			
			if (promedio_menor == 0) {
				promedio_menor = promedio;
				nombre3 = nombre;
			}
			
			if (promedio > promedio_mayor) {
				promedio_mayor = promedio;
				nombre2 = nombre;
			} 
			
			if (promedio < promedio_menor) {
				promedio_menor = promedio;
				nombre3 = nombre;
			}
			
			if (promedio >= 13 && asistencia >= 70) {
				estado = "Obtiene Certificado";
				certificados++;
			}
			else {
				estado = "Sin Certificado";
				sin_certificado++;
			}
			
			System.out.println("\n-------------------");
			System.out.println("R E S U L T A D O S");
			System.out.println("-------------------");
			System.out.println("Promedio: " + promedio);
			System.out.println("Asistencia: " + b.format(asistencia) + "%");
			System.out.println("Estado: " + estado);
			
			i = 1;
			promedio = 0;
			
			a.nextLine();
			
			System.out.print("¿Registrar otro? [S/N]: ");
			continuar = a.nextLine();
			System.out.println("");
			
		}
			
		System.out.println("-------------");
		System.out.println("R E S U M E N");
		System.out.println("-------------");
		System.out.println("Número de alumnos: " + registro);
		System.out.println("Mayor promedio: " + promedio_mayor + " pertenece a: " + nombre2);
		System.out.println("Menor promedio: " + promedio_menor + " pertenece a: " + nombre3);
		System.out.println("Número de alumnos certificados: " + certificados);
		System.out.println("Número de alumnos sin certificado: " + sin_certificado);
	}

}
