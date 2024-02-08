package Manejo_De_Cadenas;

import java.util.Scanner;

public class _09_Conteo_De_Caracteres {

	public static void main(String[] args) {
		//Escribe un programa que cuente el número de veces que aparece un carácter específico 
		//ingresado por el usuario en una cadena ingresada por el usuario.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intoduzca una frase");
		String frase = sc.nextLine();
		System.out.println("Ingrese el caracter que desee saber cuantas veces aparece");
		String caracter = sc.nextLine();
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == caracter.charAt(0)) {
				contador++;
			}
		}
	
		System.out.println("El número de veces que aparece el caracterer " + "'" + caracter + "'" + " es: " + contador );


	}

}
