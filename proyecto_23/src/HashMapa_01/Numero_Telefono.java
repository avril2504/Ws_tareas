package HashMapa_01;

import java.util.HashMap;
import java.util.Scanner;

public class Numero_Telefono {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer>nombreTelefono =
				new HashMap<>();
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("Introduzca el primer nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el numero de telefono");
			Integer nroTelefono = sc.nextInt();
			sc.nextLine();
			nombreTelefono.put(nombre, nroTelefono);
		}
		
		System.out.println("Nombres y números de telefono ingresados");
		nombreTelefono.forEach((k, v) -> {
			System.out.println("nombre: " + k.toString());
			System.out.println(" telefono: " + v.toString());
		});
	
	}

}
