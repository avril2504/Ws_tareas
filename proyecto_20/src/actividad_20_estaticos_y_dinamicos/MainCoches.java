package actividad_20_estaticos_y_dinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCoches {
	
	public ArrayList<Coche>listaCoches;
	private static Scanner sc;
		public MainCoches() {
			listaCoches = new ArrayList<>();
			this.sc = new Scanner(System.in);
		}
	
	public static void main(String[] args) {
		MainCoches m = new MainCoches();
		m.arrancarPrograma();
		
	}
	public void arrancarPrograma() {
		sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("----------Menú----------");
			System.out.println("1. Crear coche");
			System.out.println("2. Mostrar coches");
			System.out.println("3. Mostrar contadorID");
			System.out.println("4. Resetear contadorID");
			System.out.println("5. Salir del programa");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: 
				crearCoche();
				break;
			case 2: 
				mostrarCoches();
				break;
			case 3:
				mostrarContadorID();
				break;
			case 4:
				resetearContadorID();
				break;
			case 5:
				System.out.println("Saliste del programa");
			}
		}while(opcion != 5);
		
	}
	public void crearCoche() {
		System.out.println("Ingresa la matricula del coche");
		String matricula = sc.next();
		System.out.println("Ingresa la marca del coche");
		String marca = sc.next();
		Coche coche = new Coche();
		coche.setMarca(marca);
		coche.setMatricula(matricula);
		listaCoches.add(coche);
		System.out.println("Su coche ha sido añadido");
	}
	public void mostrarCoches() {
		for(Coche coches : listaCoches) {
			System.out.println(coches);
		}
	}
	public void mostrarContadorID() {
			Coche.mostrarContador();
	}
	public void resetearContadorID() {
			Coche.resetear();
	}
}
