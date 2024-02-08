package Manejo_De_Cadenas;

import java.util.Scanner;

public class _02_Mayusculas_Y_Minusculas {

	public static void main(String[] args) {
		//Desarrolla un programa que solicite al usuario ingresar una cadena 
		//y luego muestre la misma cadena en mayúsculas y minúsculas.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una frase: ");
		String frase = sc.nextLine();
		
		frase = frase.toUpperCase();
		System.out.println(frase);
		frase = frase.toLowerCase();
		System.out.println(frase);
		

	}

}
