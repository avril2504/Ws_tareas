package Manejo_De_Cadenas;

import java.util.Scanner;

public class _05_Reemplazo_De_Caracteres {

	public static void main(String[] args) {
		//Crea un programa que tome una cadena y reemplace todas las ocurrencias 
		//de un carácter específico con otro carácter ingresado por el usuario.
		Scanner sc = new Scanner(System.in);
		System.out.println("A continuacion se muestra una frase");
		String frase = "Hola, Como estas?";
		System.out.println(frase);
		System.out.println("ahora podras cambiar una letra de la frasse anterior");
		System.out.println("Para ello introduzca la letra que quiere cambiar");
		String L1 = sc.nextLine();
		System.out.println("Ahora introduzca la letra que ocupara la posición de la anterior");
		String L2 = sc.nextLine();
		String frase2 = frase.replace(L1, L2);
		System.out.println(frase2);
		
	}

}
