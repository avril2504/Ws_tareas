package Constructores_y_Metodos;

public class Videojuego {
	int id;
	String nombre;
	int puntuacion;
	double precio;
	String fechaCreacion;
	boolean segundaMano;

//Constructores
	public Videojuego() {
		this.fechaCreacion = "01/01/1970";
	}

	public Videojuego(int id, String nombre, int puntuacion, double precio, String fechaCreacion, boolean segundaMano) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fechaCreacion = fechaCreacion;
		this.segundaMano = segundaMano;
	}

	public Videojuego(String nombre, String fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
//Mostrar por pantalla todos los objetos

	public void datosVideojuego() {
		System.out.println("El id del videojuego es: " + this.id);
		System.out.println("El nombre del videojuego es: " + this.nombre);
		System.out.println("La puntuación del videojuego es: " + this.puntuacion);
		System.out.println("El precio del videojuego es: " + this.precio);
		System.out.println("LA fecha de creación del videojuego es: " + this.fechaCreacion);
		System.out.println("¿Es de segunda mano? " + this.segundaMano);
	}

	public void nombreYpuntuacion() {
		System.out.println("El nombre del videojuego es: " + this.nombre);
		System.out.println("La puntuación del videojuego es: " + this.puntuacion);
	}

	public void precioLibras() {
		double precioenLibras = this.precio * 0.86;
		System.out.println("El precio en libras es: " + precioenLibras);
	}

	public void fecha() {
		String dia = this.fechaCreacion.substring(0, 2);
		String mes = this.fechaCreacion.substring(3, 5);
		String anio = this.fechaCreacion.substring(6, 9+1);
		System.out.println(dia + "/" + mes + "/" + anio);
	}

	public double descuento() {
		double descuento = 70.0;
		if (this.segundaMano == true) {
			double total = (this.precio * descuento) / 100;
			System.out.println("con el descuento del 30% queda en: " + total);
		} else {
			System.out.println("No le corresponde descuento");
		}
		return descuento;
	}

	public void apto() {
		if (this.puntuacion >= 5) {
			System.out.println("El juego es apto");
		} else {
			System.out.println("El juego no es apto");
		}
	}

	public int Nnaturales() {
		int i = 0;
		for (i = this.puntuacion; i <= 10; i++) {
			System.out.println("Los numeros que hay entre la puntuación y el número 10 son: " + i);
		}
		return this.puntuacion;
	}

	public boolean esCaro(Videojuego Videojuego2) {
		if (this.precio > Videojuego2.precio) {
			System.out.println("El videojuego es caro");
			return true;
		} else {
			System.out.println("El videojuego no es caro");
			return false;
		}
	}
}
