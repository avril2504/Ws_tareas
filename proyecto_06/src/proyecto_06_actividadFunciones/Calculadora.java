package proyecto_06_actividadFunciones;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		//suma
		suma(1, 2);
		suma(1.25, 2.63);
		
		//resta
		resta(5, 2);
		resta(10.5, 2.4);
		
		//multiplicación
		multipilcacion(2, 20);
		multiplicacion(8.2, 2.0);
		
		//división
		division(10, 2);
		division(10.2, 2.2);
		
		//-----------------------------------------------------------
		
		imprimir();
	
	}

	// Suma int y double
	public static void suma(int n1, int n2) {
		int suma = n1 + n2;
		System.out.println("La suma es: " + suma);

	}

	public static void suma(double n1, double n2) {
		double suma = n1 + n2;
		System.out.println("La suma es: " + suma);
	}

	// Resta int y double
	public static void resta(int n1, int n2) {
		int resta = n1 - n2;
		System.out.println("La resta es: " + resta);

	}

	public static void resta(double n1, double n2) {
		double resta = n1 - n2;
		System.out.println("La suma es: " + resta);
	}

	// multiplicación int y double
	public static void multipilcacion(int n1, int n2) {
		int multiplicacion = n1 * n2;
		System.out.println("La multiplicación es: " + multiplicacion);

	}

	public static void multiplicacion(double n1, double n2) {
		double multiplicacion = n1 * n2;
		System.out.println("La muliplicació es: " + multiplicacion);
	}

	// division int y double
	public static void division(int n1, int n2) {
		int division = n1 / n2;
		System.out.println("La division es: " + division);

	}

	public static void division(double n1, double n2) {
		double division = n1 / n2;
		System.out.println("La division es: " + division);
	}
	
	//Ejercicio 3
	public static void imprimir () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		int n2 = sc.nextInt();
		
		suma(n1, n2);
		resta(n1, n2);
		multipilcacion(n1, n2);
		division(n1, n2);
	}

}
