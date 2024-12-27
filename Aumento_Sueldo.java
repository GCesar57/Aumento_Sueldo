package com.estructurasSelectivas.com.ejercicio5;

import java.util.Scanner;

public class Aumento_Sueldo {

	public static void main(String[] args) {
		//* Aplica un aumento del 15% al sueldo de un trabajador
		//* si este es menor a $1,000.00, en caso contrario un aumento del 12%
		Scanner entrada = new Scanner(System.in);
		double sueldo, nuevoSueldo;
		//
		System.out.println("Ingrese el sueldo del trabajador: ");
		sueldo = entrada.nextDouble();
		if (sueldo < 1000) {
			nuevoSueldo = sueldo * 1.15;
			System.out.println("El nuevo Sueldo del Trabajador es: "+nuevoSueldo);
		}else {
			nuevoSueldo = sueldo * 1.12;
			System.out.println("El nuevo Sueldo del Trabajador es: "+nuevoSueldo);
		}//
		entrada.close();
	}
	//113

}
