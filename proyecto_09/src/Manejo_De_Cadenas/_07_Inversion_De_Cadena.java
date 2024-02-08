package Manejo_De_Cadenas;

import java.util.Scanner;

public class _07_Inversion_De_Cadena {

	public static void main(String[] args) {
		//Escribe un programa que tome una cadena como entrada y muestre la misma cadena pero invertida. 
		//Por ejemplo, si el usuario ingresa "Java", el programa debería mostrar "avaJ".
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra");
		String frase = sc.nextLine();
		for(int i = frase.length()-1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}

	}

}
