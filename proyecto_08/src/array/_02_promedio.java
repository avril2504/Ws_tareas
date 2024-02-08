package array;

import java.util.Scanner;

public class _02_promedio {

	public static void main(String[] args) {
		// Escribe un programa que solicite al usuario ingresar 
		//el tamaño de un array de números reales. A continuación 
		//se le pedirá números hasta que el array esta lleno y por 
		//último imprimirá la media aritmética de todos ellos.
		Scanner sc = new Scanner(System.in);
		
		
		double suma = 0;
		double media = 0;
		System.out.println("Ingresa el tamaño del array");
		int tamaño = sc.nextInt();
		
		int[] num = new int [tamaño];
		for(int i = 0; i < tamaño; i++) {
			System.out.println("ingresa los números: ");
			num[i] = sc.nextInt();

		}

		for (int i = 0; i < tamaño; i++) {
			suma += num[i];
			media = suma / tamaño;
		}
		System.out.println("La media aritmética es: " + media);

	}

}
