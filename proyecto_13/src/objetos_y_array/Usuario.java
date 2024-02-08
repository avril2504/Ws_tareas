package objetos_y_array;

import java.util.Arrays;

public class Usuario {
	int id;
	String nombre;
	int[] valoracion;
	
	
	//constructores
	
	public Usuario() {
		super();
	}
	
	public Usuario(int id, String nombre, int[] valoracion) {
		this.id = id;
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "usuarios [id=" + id + ", nombre=" + nombre + ", valoracion=" + Arrays.toString(valoracion) + "]";
	}
	
	public void Datos() {
		System.out.println("usuarios [id=" + id + ", nombre=" + nombre + ", valoracion=" + Arrays.toString(valoracion) + "]");
		
	}
	/**
	 * Los objetos tendrán la opción de devolver su valoración media. Por ejemplo, si un objeto tiene [3,5,7], devolverá 5.
	 * @return
	 */
	public double media() {
		double media = 0;
		for (int i = 0; i < this.valoracion.length; i++) {
			media += this.valoracion[i];
		}
		media /= this.valoracion.length;
		System.out.println("La media es: " + media);
		return media;
		
	}
	/**
	 * Los objetos tendrán la opción de mostrar todas sus valoraciones.
	 */
	public void valoraciones() {
		for(int i = 0; i < this.valoracion.length; i++) {
			System.out.println(this.valoracion[i]);
		}
	}
	/**
	 * Los objetos tendrán la opción de decir cuantas valoraciones superan una valoración dada.
	 *Esto es, tendrán un método que reciba como parámetro de entrada un numero del 1 al 10, 
	 *dicho método devolverá cuantas valoraciones superan dicha valoración. Por ejemplo, 
	 *si un usuario tiene las valoraciones [1,4,7,10] y le pasamos un 5, el método me tiene que devolver un 2.
	 * @param valoracion
	 */
    public void SuperaValoraciones(int valoracion) {
    	int contador = 0;
    	int valoracionesTotal = 0;
    	for(int i = 0; i < this.valoracion.length; i++) {
    		valoracionesTotal = this.valoracion[i];
    		if(valoracionesTotal > valoracion) {
    			contador++;
    		}
    	}
    	System.out.println("las valoraciones que superan a " + valoracion + " son: " +contador);
	}
    /**
     * Los objetos tendrán la opción de devolver si una valoración dada supera o no la valoración medía del usuario. 
     * Por ejemplo, si un objeto tiene  [3,5,7] y le pasamos un 4, devolverá false, pero si le pasamos un 6 devolverá true.
     * @param valoracion
     * @return
     */
    public boolean superaMedia(int valoracion) {
    	double media = this.media();
		media /= this.valoracion.length;
		if(valoracion > media) {
			System.out.println(true);
			return true;
		}else {
			System.out.println(false);
			return false;
		}
    }

}
