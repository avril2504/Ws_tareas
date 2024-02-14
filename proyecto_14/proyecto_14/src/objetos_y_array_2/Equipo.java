package objetos_y_array_2;

import java.util.Arrays;

public class Equipo {
	String nombre;
	String[] lista_jugadores;
	
	//constructores
	
	public Equipo() {
		super();

	}

	public Equipo(String nombre, String[] lista_jugadores) {
		super();
		this.nombre = nombre;
		this.lista_jugadores = lista_jugadores;
	}
	
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", lista_jugadores=" + Arrays.toString(lista_jugadores) + "]";
	}
	
	/**
	 * Los objetos tendrán la opción de mostrar todos sus datos por pantalla
	 * (Método toString())
	 */
	public void Datos() {
		System.out.println("Equipo [nombre=" + nombre + ", lista_jugadores=" + Arrays.toString(lista_jugadores) + "]");
	}

	/**
	 * Los objetos tendrán la opción de mostrar todos sus jugadores
	 */
	
	public void jugadores() {
		for(String jugador : lista_jugadores) {
			System.out.println(jugador);
		}
	}
	
	/**
	 * Los objetos tendrán la opción de devolver si existe un jugador
	 * pasado por párametro
	 */
	
	public boolean existe(String jugadorBuscado) {
		for(String jugador : this.lista_jugadores) {
			if(jugador.equals(jugadorBuscado)) {
				System.out.println("Si se encuentra");
				return true;
			}
		}
		
		System.out.println("No se encuentra");
		return false;
	}
	
	/**
	 * Los objetos tentran la opcion de devolver el numero de jugadores
	 * que tienen
	 */
	
	public int numero_jugadores() {
		int contadorjugadores = 0;
		for(String j : lista_jugadores) {
			if(j != null) {
				contadorjugadores++;
			}
		}
		return contadorjugadores;
	}
	
	/**
	 * Los objetos tendrán la opción de devolver si el número de jugadores
	 * que tienen es apto para jugar. Un equipo es apto para jugar si tiene
	 * al menos 7 jugadores
	 */
	public boolean apto() {
		if(numero_jugadores() > 6 ) {
			System.out.println("Si es apto");
			return true;
		}else {
			System.out.println("No es apto");
			return false;
		}
	}
	
	/**
	 * Los objetos tendrán la opción de devolver si una lista de jugadores 
	 * pasada por parámetro es exactamente igual a su lista de jugadores
	 */
	
    public boolean lista_igual(String[] otra_lista) {
        if (this.lista_jugadores.length != otra_lista.length) {
            System.out.println("No es igual");
            return false;
        }

        for (int i = 0; i < this.lista_jugadores.length; i++) {
            if (!this.lista_jugadores[i].equals(otra_lista[i])) {
                System.out.println("No es igual");
                return false;
            }
        }

        System.out.println("Es igual");
        return true;
    }
    
    /**
     * Los objetos tendrán la opción de devolver si un equipo pasado por parámetro
     * es exactamente igual al mismo. Un equipo es exactamente igual si tiene el mismo 
     * nombre y la misma lista de jugadores con los mismos nombres.
     */
	
    public boolean equipo_igual(Equipo otroEquipo) {
        // Comparar nombres de equipo
        if (!this.nombre.equals(otroEquipo.nombre)) {
            System.out.println("No es igual");
            return false;
        }

        // Comparar longitudes de lista de jugadores
        if (this.lista_jugadores.length != otroEquipo.lista_jugadores.length) {
            System.out.println("No es igual");
            return false;
        }

        // Comparar jugadores individualmente
        for (int i = 0; i < this.lista_jugadores.length; i++) {
            if (!this.lista_jugadores[i].equals(otroEquipo.lista_jugadores[i])) {
                System.out.println("No es igual");
                return false;
            }
        }

        // Si llegamos aquí, los equipos son exactamente iguales
        System.out.println("Es igual");
        return true;
    }
}
	

