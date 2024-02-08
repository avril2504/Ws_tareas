package Constructores_Y_Metodos_2;

public class Coche {
	
	int id;
	String marca;
	String modelo;
	double precio;
	String fecha_matriculacion;
	int kilometros;
	
	
	//Constructores
	
	//Sin parametros
	public Coche() {
		this.marca = "";
		this.modelo = "";
	}
	
	//con parametros
	public Coche(int id, String marca, String modelo, double precio, String fecha_matriculacion, int kilometros) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.fecha_matriculacion = fecha_matriculacion;
		this.kilometros = kilometros;
		
	}

	//Funcionalidad (métodos)
	
	//toString
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", fecha_matriculacion=" + fecha_matriculacion + ", kilometros=" + kilometros + "]";
	}
	/**
	 * Este metodo mostrara por pantalla los datos de uno de los constructores
	 */
	public void datos() {
		System.out.println("Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", fecha_matriculacion=" + fecha_matriculacion + ", kilometros=" + kilometros + "]");
	}
	
	//Precio base
	
	/**
	 * Este metodo mostrara por pantalla el precio base del coche que seleccionemos
	 */
	public void precio_base() {
		System.out.println("El precio base es: " + this.precio);
	}
	
	//Año de matriculación
	
	/**
	 * Este metodo mostrara el año de matriculacion a partir del atributo "fecha_matriculacion"
	 *y utiliznado la funcion ".length"
	 */
	public void anio_matriculacion() {
		String anio_matriculacion = this.fecha_matriculacion.substring(6,this.fecha_matriculacion.length());
		System.out.println("El año de matriculación es: " + anio_matriculacion);
	}
	
	//año bisiesto
	
	/**
	 * Este mtodo mostrara si un año es bisiesto o no.
	 * Al atributo "fecha_matriculacion" le aplicaremos la funcion ".length"
	 * luego se tranformara ese String a int para poder aplicar la 
	 * formula y saber si es bisiesto o no
	 */
	
	public void anio_bisiesto() {
		String anio = this.fecha_matriculacion.substring(6,this.fecha_matriculacion.length());
		int anio1 = Integer.parseInt(anio);
		boolean bisiesto = ((anio1 % 4 == 0) && (anio1 % 100 != 0) || (anio1 % 400 == 0));
		if(bisiesto) {
			System.out.println("El año es bisiesto");
		}else {
			System.out.println("El año no es bisiesto");
		}
			
		}
	
	//precio en función de los kilometros
	
	/**
	 * Este metodo mostrara el precio del coche a partir de 
	 * sus kilometros
	 * @return
	 */
	
	public double precio_kilometros() {
		double descuento = this.precio;
		if(this.kilometros < 10000) {
			System.out.println("El precio es: " + this.precio);
		}else if(this.kilometros > 10000 && this.kilometros < 50000) {
			 descuento =  this.precio * 0.8;
			System.out.println("El precio es: " + descuento);
		}else if(this.kilometros >= 50000) {
			descuento = this.precio * 0.5;
			System.out.println("EL precio es: " + descuento);
		}
		return descuento;
	}
	
	//números de kilometros primos
	
	/**
	 * Este metodo mostrara si los kilometros del coche es un número primo
	 * o no
	 */
	
	public void primos_kilometros() {
		int contador = 0;
		for(int i = 1; i <= this.kilometros; i++) {
			if(this.kilometros % i == 0) {
				contador++;
			}
		}
		if(contador == 2) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
	}
	
	/**
	 * Este metodo mostrara cuantos kilometros le falta a un coche para
	 * alcanzar los 200000km
	 */
	public void falta_kilometros() {
		int kilometrosRestantes = 0;
		for(int i = (int) this.kilometros ; i < 200000 ; i++) {
			kilometrosRestantes ++;
		}
		System.out.println("Los kilometros restantes son: " + kilometrosRestantes);
	}
	
	//caracteres
	
	/**
	 * Este metodo nos devolvera la cantidad de caracteres de los atributos
	 * marca y modelo
	 */

	public void caracteres() {
		System.out.println("La cantidad de caracteres de la marca es: " + this.marca.length());
		System.out.println("La cantidad de caracteres del modelo es: " + this.modelo.length());
	}
	
	//diferencia de kilometros
	
	/**
	 * Este metodo nos mostrara la diferencioa de kilometros entre un coche y otro
	 * @param coche2
	 */

	public void diferencia(Coche coche2) {
		int diferencia = Math.abs(this.kilometros - coche2.kilometros);
		System.out.println("La diferencia de kilometros de los coches es: " + diferencia);
		
	}
	
	
	//coche mas caro
	
	/**
	 * Este metodo nos comparara un coche con otro y nos dira si es mas caro o no
	 * @param coche2
	 * @return
	 */
	
	public boolean masCaro(Coche coche2) {
		if(this.precio > coche2.precio){
			System.out.println("El coche es mas caro");
			return true;
		}else {
			System.out.println("El coche no es mas caro");
			return false;
		}
	}
}
