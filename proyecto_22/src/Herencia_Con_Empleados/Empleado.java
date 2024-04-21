package Herencia_Con_Empleados;

public class Empleado {
	private int id;
	private String dni;
	private String nombre;
	private double sueldo_base;
	private static int contadorID = 0;
	
	 public Empleado(String dni, String nombre, double sueldo_base) {
	        this.id = ++contadorID; // Asegúrate de que se incrementa el ID
	        this.dni = dni;
	        this.nombre = nombre;
	        this.sueldo_base = sueldo_base;
	    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo_base() {
		return sueldo_base;
	}
	public void setSueldo_base(double sueldo_base) {
		this.sueldo_base = sueldo_base;
	}
	public static int getContadorID() {
		return contadorID;
	}
	
	public double salarioTotal() {
		return sueldo_base;
	}
	
	
	
}
