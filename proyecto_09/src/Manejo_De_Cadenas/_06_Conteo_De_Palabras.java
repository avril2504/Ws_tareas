package Manejo_De_Cadenas;

import java.util.Scanner;

public class _06_Conteo_De_Palabras {

	public static void main(String[] args) {
		//Desarrolla un programa que cuente el número de palabras en una cadena 
		//ingresada por el usuario. Considera que las palabras están separadas 
		//por espacios.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		
		String[] division = frase.split(" ");
		System.out.println("La cantidad de palabras son: " + division.length);
	}

}
 