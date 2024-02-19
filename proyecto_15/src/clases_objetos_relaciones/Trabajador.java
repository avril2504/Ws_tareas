package clases_objetos_relaciones;

public class Trabajador {

	private String nombre;
	private String dni;
	private double salario;

	// constructor por defecto
	public Trabajador() {
		super();
	}

	// constructor con parametros
	public Trabajador(String nombre, String dni, double salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}

	// constructores Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Métodos
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}

	/**
     * Tendrán la opción de devolver la validación para un DNI
      */

	 public boolean validar() {
         return dni.matches("\\d{8}[A-HJ-NP-TV-Z]");

     }

	/**
	 * Tendra la opci{on de devolver si un DNI es valido o no
	 * @param dni
	 * @return
	 */

	public boolean validarDNI() {
		if (validar()) {
			System.out.println("Es valido");
			return true;
		} else 
			System.out.println("No es valido");
			return false;
		}

	/**
	 * Los objetos tendrán la opción de devolver si un trabajador
	 * gana más que otro trabajador pasado por parámetro. 
	 */

	public boolean salario_mayor(double salario1, double salario2) {
		if (salario1 > salario2) {
			System.out.println(salario1 + "es mayor que " + salario2);
			return true;
		} else if (salario2 > salario1) {
			System.out.println(salario2 + "es mayor que " + salario1);
			return true;
		}
		return false;
	}
	/** 
	 * Tendrán la opción de devolver si un trabajador es igual a otro. 
	 * Un trabajador es exactamente igual a otro si tiene todos sus atributos
	 * iguales.
	 */
	
	public boolean trabajador_igual(Trabajador trabajador) {
		if(this.nombre.equals(trabajador.nombre)&&
		   this.dni.equals(trabajador.dni)&&
		   this.salario == (trabajador.salario)) {
			System.out.println("Son iguales");
			return true;
		}else {
			System.out.println("No son iguales");
			return false;
		}
		
	}
}
