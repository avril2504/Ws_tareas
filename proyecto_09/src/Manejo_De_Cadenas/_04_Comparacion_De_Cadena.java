package Manejo_De_Cadenas;

import java.util.Scanner;

public class _04_Comparacion_De_Cadena {

	public static void main(String[] args) {
		//Escribe un programa que pida al usuario su nombre de usuario y su password. 
		//El programa mostrará "bienvenido a nuestro programa" si el usuario 
		//es igual a "Capi" y el password es igual a "odioAironMan69", 
		//en caso contrario el programa mostrará "Usuario o password incorrecto". 
		//En el caso del usuario, puede ser igual sin tener en cuenta mayúsculas o minúsculas, 
		//pero en el caso del password tiene que ser exactamente igual. Además, 
		//se debe de eliminar todos los espacios que haya a derecha y a izquierda tanto para 
		//el usuario como para el password.
		Scanner sc = new Scanner(System.in);
		final String Capi = "Capi";
		final String Clave = "odioAironMan69";
		
		
		System.out.println("Ingrese su nombre de usuario: ");
		String nombre = sc.nextLine();
		nombre = nombre.trim();
		System.out.println("Ingrese su contraseña: ");
		String contraseña = sc.nextLine();
		contraseña = contraseña.trim();
	
		
		if(nombre.equalsIgnoreCase(Capi) && contraseña.equals(Clave)) {
			System.out.println("Bienvenido a nuestro programa");
		}else {
			System.out.println("Usuario o contraseña incorrecta");
		
		}
		
	}

}
