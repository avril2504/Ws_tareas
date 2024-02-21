package arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainEquipo {

	public static void main(String[] args) {
		
		//Equipos
		
		//Equipo 1
		Equipo equipo1 = new Equipo();
		ArrayList<String> listaArray = new ArrayList<String>(List.of("Luis", "Juan", "Jose", "Adrian", "Hugo", "Aron", "Jesus"));
		//System.out.println("jugadores");
        //jugadores.forEach(System.out::println);
		equipo1.nombre = "Tiburones";
		equipo1.lista_jugadores = listaArray;
		
		//Equipo 2
		ArrayList<String> listaArray2 = new ArrayList<String>(List.of("Pedro", "Pepe", "Cristian", "Luis", "Michael", "Eduardo"));
		Equipo equipo2 = new Equipo("Leones", listaArray2);
		equipo2.lista_jugadores = listaArray2;
		
		ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
		listaEquipos.add(equipo1);
		listaEquipos.add(equipo2);
		
		for(Equipo s : listaEquipos) {
			System.out.println("----------Mostrar Jugadores----------");
			s.mostrarJugadores();
			System.out.println("----------Existe jugadore----------");
			System.out.println(s.existeJugador("Pepe"));
			System.out.println("----------Cantidad de jugadores----------");
			System.out.println(s.cantidadDeJugadores());
			System.out.println("----------Apto para jugar----------");
			System.out.println(s.aptoParaJugar());
			System.out.println("----------Listas iguales----------");
			System.out.println(s.listasIguales(equipo2));
			System.out.println("----------Equipos iguales----------");
			System.out.println(s.equiposIguales(equipo2));
			
		}
		
	}

}
