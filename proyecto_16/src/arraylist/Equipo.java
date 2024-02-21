package arraylist;

import java.util.ArrayList;

public class Equipo {
	
	String nombre;
	ArrayList<String> lista_jugadores;
	
	public Equipo() {
	}
	
	public Equipo(String nombre, ArrayList<String> jugadores) {
		this.nombre = nombre;
		this.lista_jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Equipo2 [nombre=" + nombre + ", jugadores=" + lista_jugadores + "]";
	}

	public void mostrarJugadores() {
		for(String jugador : lista_jugadores) {
			System.out.println(jugador);
		}
	}
	
	public boolean existeJugador(String jugador) {
		for (String j : lista_jugadores) {
			if (j.equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}
	
	public int cantidadDeJugadores() {
		int contadorJugadores = 0;
		for(String j : lista_jugadores) {
			if(j != null) {
				contadorJugadores++;
			}
		}
		return contadorJugadores;
	}
	
	public boolean aptoParaJugar() {
		if (cantidadDeJugadores() > 6) {
			return true;
		}
		return false;
	}
	
	public boolean listasIguales (Equipo segundoEquipo) {
		if (this.lista_jugadores.size() != segundoEquipo.lista_jugadores.size()) {
			return false;
		}
		
		for(String otroJugador : segundoEquipo.lista_jugadores) {
			if(existeJugador(otroJugador)) {
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean equiposIguales (Equipo segundoEquipo) {
		if (this.nombre.equalsIgnoreCase(segundoEquipo.nombre)
				&& listasIguales(segundoEquipo)) {
			return true;
		}
		return false;
	}
	
}


