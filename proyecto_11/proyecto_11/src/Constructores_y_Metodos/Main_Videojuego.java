package Constructores_y_Metodos;

import java.util.Scanner;

public class Main_Videojuego {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Videojuego videojuego1 = new Videojuego();
		
		System.out.println("Introduzca el id:");
		videojuego1.id = sc.nextInt();
		System.out.println("Introduzca el nombre");
		videojuego1.nombre = sc.next();
		System.out.println("Introduzca la puntuación:");
		videojuego1.puntuacion = sc.nextInt();
		System.out.println("Introduzca el precio:");
		videojuego1.precio = sc.nextDouble();
		System.out.println("Introduzca si es de segunda mano:");
		videojuego1.segundaMano = sc.nextBoolean();
		
		Videojuego videojuego2 = new Videojuego(123456, "Luis", 6, 15, "01/01/1970", true);
		Videojuego videojuego3 = new Videojuego(587614, "Adriana", 4, 20, "01/01/1970", false);
		
		funciones(videojuego1);
		videojuego1.esCaro(videojuego2);
		System.out.println();
		
		funciones(videojuego2);
		videojuego2.esCaro(videojuego2);
		System.out.println();
		
		funciones(videojuego3);
		videojuego3.esCaro(videojuego2);
	}
	
	public static void funciones(Videojuego v) {
		v.datosVideojuego();
		System.out.println("----------------------------------------");
		
		v.nombreYpuntuacion();
		System.out.println("----------------------------------------");
		
		v.precioLibras();
		System.out.println("----------------------------------------");
		
		v.fecha();
		System.out.println("----------------------------------------");
		
		v.descuento();
		System.out.println("----------------------------------------");
		
		v.apto();
		System.out.println("----------------------------------------");
		
		v.Nnaturales();
		System.out.println("----------------------------------------");
		
	}

}
