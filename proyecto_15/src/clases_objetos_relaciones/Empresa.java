package clases_objetos_relaciones;

import java.util.Arrays;

public class Empresa {
	
	private String nombre;
	private String nif;
	private Trabajador[]lista_trabajadores;
	
	//constructor por defecto
	public Empresa() {
		super();
	}
	
	//constructor con parametros
	public Empresa(String nombre, String nif, Trabajador[] lista_trabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.lista_trabajadores = lista_trabajadores;
	}
	
	//constructores Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Trabajador[] getLista_trabajadores() {
		return lista_trabajadores;
	}

	public void setLista_trabajadores(Trabajador[] lista_trabajadores) {
		this.lista_trabajadores = lista_trabajadores;
	}

	/**
	 * Tendrán la opción de mostrar todos sus datos por pantalla (mediante el método toString()).
	 * Esto incluye todos los trabajadores con sus datos.
	 */
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", nif=" + nif + ", lista_trabajadores="
				+ Arrays.toString(lista_trabajadores) + "]";
	}
	
	/**
	 * Tendrán la opción de mostrar todos los datos de sus trabajadores.
	 */
	
	public void datos_trabajadores() {
		for(Trabajador trabajador : lista_trabajadores) {
			System.out.println(trabajador);
		}
			
	}
	/**
	 * Tendrán la opción de saber si existe un trabajador en la empresa, pasándole un DNI por parámetro
	 */
	
	public void ExisteTrabajadorDNI(String dni) {
		for(Trabajador trabajador : this.lista_trabajadores) {
			System.out.println(trabajador.getDni().equals(dni));	
		}
		
	}
	/**
	 * Tendrán la opción de devolver el numero de trabajadores que tienen
	 */
	
	public int numero_trabajadores() {
		int contador = 0;
		for(Trabajador trabajadores : this.lista_trabajadores) {
			if(trabajadores != null) {
				contador++;
			}
		}
		return contador;
	}
	/**
	 * Tendrán la opción de devolver el salario total que se gasta en sus trabajadores
	 */
	
	public double salario_total() {
		double suma = 0.00;
		for(Trabajador trabajadores : this.lista_trabajadores) {
			suma += trabajadores.getSalario();
		}
		System.out.println(suma);
		return suma;
	}
	/**
	 * Tendrán la opción de devolver cuantos trabajadores ganan más de 3000€
	 */
	
	public int ganan_mas_tresmil() {
		return ganan_mas(3000);
			
	}
	/**
	 * Tendrán la opción de devolver cuantos trabajadores ganan menos del SMI
	 */
	public int ganan_memos_SMI() {
		int contador = 0;
		for(Trabajador trabajadores : this.lista_trabajadores) {
			if(trabajadores.getSalario() < 1300) {
				contador++;
			}
			
		}
		return contador;
	}
	/**
	 * Tendrán la opción de devolver cuantos trabajadores ganan más que una cantidad
	 * pasada por parámetro.
	 */
	public int ganan_mas(double salario) {
		int contador = 0;
		for(Trabajador trabajadores : this.lista_trabajadores) {
			if(trabajadores.getSalario() > salario) {
				contador++;
			}
			
		}
		return contador;
	}
	/**
	 * Tendrán la opción de devolver si todos los trabajadores tienen un DNI valido
	 */
	public int DNIvalidoTrabajadores() {
		int contador = 0;
		for(Trabajador trabajadores : this.lista_trabajadores) {
			if(trabajadores.validarDNI() == true) {
				contador++;
			}
			
		}
		return contador;
	}
	/**
	 * Tendrán la opción de devolver si una empresa pasada por parámetro es exactamente igual a la  misma.
	 * Un empresa es exactamente igual si tiene el mismo nombre y el mismo NIF
	 */
	
	public boolean empresa_igual(Empresa empresa) {
		if(this.nombre.equals(empresa.nombre)&&
			this.nif.equals(empresa.nif)) {
			System.out.println("Son iguales");
			return true;
		}else {
			System.out.println("No son iguales");
			return false;
		}
	}

}
