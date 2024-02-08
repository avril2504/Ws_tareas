package array;

import java.util.Scanner;

public class _01_Suma_De_Elementos {

	public static void main(String[] args) {
		// Escribe un programa que solicite al usuario ingresar
		// el tamaño de un array de números enteros. A continuación
		// se le pedirá números hasta que el array esta lleno y por
		// último imprimirá la suma de todos los elementos.
		Scanner sc = new Scanner(System.in);

		int suma = 0;

		System.out.println("Ingresa el tamaño del array");

		int tamaño = sc.nextInt();
		
		int[] num1 = new int[tamaño];
		
		for (int i = 0; i < tamaño; i++) {
			System.out.println("Ingresa los números: ");
			num1[i] = sc.nextInt();
		}

		for (int i = 0; i < num1.length; i++) {
			suma = suma + num1[i];
		}

		System.out.println("suma de los números" + suma);

	}

}