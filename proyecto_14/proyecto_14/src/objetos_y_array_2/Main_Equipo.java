package objetos_y_array_2;

import java.util.Scanner;

public class Main_Equipo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Equipo equipo1 = new Equipo();
		String[] listaArray = {"luis", "Juan", "jose", "Adrian", "Hugo", "Aron","Jesus"};
		equipo1.lista_jugadores = listaArray;
		equipo1.nombre = "Tiburones";

		String[] listaArray2 = {"Pedro", "Pepe", "Cristian", "Luis", "Michael", "Eduardo"};
		Equipo equipo2 = new Equipo("Leones", listaArray2);
		equipo2.lista_jugadores = listaArray2;
		
		Equipo[] ArrayEquipos = new Equipo[2];
		ArrayEquipos[0] = equipo1;
		ArrayEquipos[1] = equipo2;
		
		for(int i = 0; i < ArrayEquipos.length; i++) {
			Equipo equipo = ArrayEquipos[i];
			System.out.println(equipo);
			System.out.println("----------Datos----------");
			equipo.Datos();
			System.out.println("----------jugadores----------");
			equipo.jugadores();
			System.out.println("----------existe----------");
			System.out.println("Introduzca un jugador y vera si se encuentra en la lista de jugadores:");
			String jugador = sc.nextLine();
			equipo.existe(jugador);
			System.out.println("----------numero_jugadores----------");
			equipo.numero_jugadores();
			System.out.println("----------apto----------");
			equipo.apto();
			System.out.println("----------lista_igual----------");
			equipo.lista_igual(listaArray);
			System.out.println("----------equipo_igual----------");
			equipo.equipo_igual(equipo1);

		}
	}	
}
