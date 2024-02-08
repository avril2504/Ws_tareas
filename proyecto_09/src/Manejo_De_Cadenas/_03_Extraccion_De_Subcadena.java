  package Manejo_De_Cadenas;

import java.util.Scanner;

public class _03_Extraccion_De_Subcadena {

	public static void main(String[] args) {
		//Pide al usuario que ingrese una cadena y dos índices. 
		//Luego, muestra la subcadena comprendida entre esos dos índices.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		String frase = sc.nextLine();
		System.out.println("Ingresa el primer índice: ");
		int i1 = sc.nextInt();
		System.out.println("Ingresa el segundo índice: ");
		int i2 = sc.nextInt();
		
		System.out.println(frase.substring(i1, i2 + 1));
		


	}

}
