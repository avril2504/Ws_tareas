package Manejo_De_Cadenas;

import java.util.Scanner;

public class _01_Longitud_De_Una_Cadena {

	public static void main(String[] args) {
		//Escribe un programa que solicite al usuario ingresar una cadena 
		//y muestre la longitud de la cadena ingresada.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una frase: ");
		String cadena = sc.nextLine();
		
		System.out.println("Longitud");
		System.out.println(cadena.length());
		
		System.out.println("Letras de la frase");
		for(int i = 0; i < cadena.length(); i++) {
			System.out.print(cadena.charAt(i));
		}

	}

}
