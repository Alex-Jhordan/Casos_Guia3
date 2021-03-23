package com.senati.eti;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		DecimalFormat b = new DecimalFormat("#.00");
		
		String continuar = "S", empleado2 = "", empleado3 = "", empleado_tardon = "";
		int registro = 0, meta = 0;
		float sueldo_bruto = 0, bonificacion = 0, descuento = 0, sueldo_neto = 0;
		float porcentaje = 0, sueldo_neto_mayor = 0, sueldo_neto_menor = 0, mayor_tardanza = 0;
		
		while (continuar.equals("S")) {
			
			registro++; 
			
			System.out.println("******************************");
			System.out.println("Registro de Empleados (" + registro + ")");
			System.out.println("******************************");
			System.out.print("Empleado: ");
			String empleado = a.nextLine();
			System.out.print("Horas trabajadas: ");
			float horas_trabajadas = a.nextInt();
			System.out.print("Tarifa por hora: ");
			float tarifa_por_hora = a.nextFloat();
			System.out.print("Minutos de tardanza: ");
			float tardanza = a.nextInt();
			
			sueldo_bruto = horas_trabajadas * tarifa_por_hora;
			
			if (horas_trabajadas <= 50)
				bonificacion = 0;
			else if (horas_trabajadas > 50 && horas_trabajadas <= 60) 
				bonificacion = sueldo_bruto * 0.02f;
			else if (horas_trabajadas > 60 && horas_trabajadas <= 70) 
				bonificacion = sueldo_bruto * 0.08f;
			else if (horas_trabajadas > 70 && horas_trabajadas <= 80) 
				bonificacion = sueldo_bruto * 0.13f;
			else
				bonificacion = sueldo_bruto * 0.15f;
			
			if (tardanza <= 15)
				descuento = 0;
			else if (tardanza > 15 && tardanza <= 30)
				descuento = sueldo_bruto * (0.003f * tardanza);
			else
				descuento = sueldo_bruto * (0.005f * tardanza);
			
			sueldo_neto = (sueldo_bruto + bonificacion) - descuento;
			porcentaje =  (horas_trabajadas * 100) / 80;
			
			if (sueldo_neto_menor == 0) {
				sueldo_neto_menor = sueldo_neto;
				empleado3 = empleado;
			}
			
			if (sueldo_neto > sueldo_neto_mayor) {
				sueldo_neto_mayor = sueldo_neto;
				empleado2 = empleado;
			} 
			
			if (sueldo_neto < sueldo_neto_menor) {
				sueldo_neto_menor = sueldo_neto;
				empleado3 = empleado;
			}
			
			if (tardanza > 0) {
				mayor_tardanza = tardanza;
				empleado_tardon = empleado;
			}
			
			if (porcentaje > 90)
				meta++;
					
			System.out.println("\n******************");
			System.out.println("    Resultados    ");
			System.out.println("******************");
			System.out.println("Sueldo bruto : " + b.format(sueldo_bruto));
			System.out.println("Bonificación : " + bonificacion);
			System.out.println("Descuento    : " + descuento);
			System.out.println("Sueldo neto  : " + b.format(sueldo_neto));
			System.out.println("% Alcanzado  : " + b.format(porcentaje) + "%");
			System.out.println("******************");
			
			a.nextLine();
			
			System.out.print("¿Nuevo empleado? [S/N]: ");
			continuar = a.nextLine();
			System.out.println("");
		}
		
		System.out.println("----------------------");
		System.out.println("---R E S U M E N------");
		System.out.println("----------------------");
		System.out.println("Número de empleados: " + registro);
		System.out.println("Sueldo neto mayor: " + sueldo_neto_mayor + " pertenece a: " + empleado2);
		System.out.println("Sueldo neto menor: " + sueldo_neto_menor + " pertenece a: " + empleado3);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + empleado_tardon + " (" + mayor_tardanza + " min.)");
		System.out.println("Cantidad de empleados con mas del 90% de la meta: " + meta);
	}

}
