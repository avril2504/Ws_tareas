package Manejo_De_Cadenas;

import java.util.Scanner;

public class _08_Palindromo {

	public static void main(String[] args) {
		//Desarrolla un programa que determine si una palabra ingresada por el usuario 
		//es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda), 
		//ignorando mayúsculas y minúsculas.
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduzca una palabra: ");
		String palabra = sc.next();
		char caracter;
		String cadenainvertida = "";
		
		palabra.equalsIgnoreCase(palabra);
		for(int i = palabra.length()-1; i >= 0; i--) {
			caracter = palabra.charAt(i);
			cadenainvertida += caracter;
					
		}
		if(palabra.equals(cadenainvertida)) {
			System.out.println("Se lee igual");
		}else {
			System.out.println("No se lee igual");
			}

		}

	}


