package Personas;

import java.util.HashMap;
import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Persona> mapaPersonas = new HashMap<>();

		int opcion;
		do {
			System.out.println("Opciones:");
			System.out.println("1. Introducir Persona.");
			System.out.println("2. Mostrar Personas.");
			System.out.println("3. Buscar persona por nombre.");
			System.out.println("4. Salir del programa.");
			System.out.print("Seleccione una opción: ");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				introducirPersona(sc, mapaPersonas);
				break;
			case 2:
				mostrarPersonas(mapaPersonas);
				break;
			case 3:
				buscarPersonaPorNombre(sc, mapaPersonas);
				break;
			case 4:
				System.out.println("Saliste del programa");
				break;
			default:
				System.out.println("Opción inválida. Inténtelo de nuevo.");

			}

		} while (opcion != 4);
	}

	private static void buscarPersonaPorNombre(Scanner sc, HashMap<String, Persona> mapaPersonas) {
		System.out.print("Introduzca el nombre de la persona a buscar: ");
		String nombre = sc.nextLine();
		Persona persona = mapaPersonas.get(nombre);
		if (persona != null) {
			System.out.println("Persona encontrada:");
			System.out.println(
					"Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad() + ", Peso: " + persona.getPeso());
		} else {
			System.out.println("No se encontró ninguna persona con ese nombre.");
		}
	}

	private static void mostrarPersonas(HashMap<String, Persona> mapaPersonas) {

		System.out.println("\nListado de Personas:");

		for (Persona persona : mapaPersonas.values()) {
			System.out.println(
					"Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad() + ", Peso: " + persona.getPeso());
		}
	}

	private static void introducirPersona(Scanner sc, HashMap<String, Persona> mapaPersonas) {

		System.out.print("Introduzca el nombre de la persona: ");

		String nombre = sc.nextLine();
		System.out.print("Introduzca la edad de la persona: ");
		int edad = sc.nextInt();
		System.out.print("Introduzca el peso de la persona: ");
		double peso = sc.nextDouble();

		if (mapaPersonas.containsKey(nombre)) {
			System.out.print("Ya existe una persona con ese nombre. ¿Desea sobrescribirla? (y/n): ");

			char respuesta = sc.next().charAt(0);
			if (respuesta != 'y') {
				return;
			}
		}
		mapaPersonas.put(nombre, new Persona(nombre, edad, peso));
		System.out.println("Persona añadida correctamente.");

	}

}