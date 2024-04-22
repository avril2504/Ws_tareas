package Herencia_Con_Empleados;

public class JefeProyecto extends Empleado {
	private double incentivos;

	
	public JefeProyecto(String dni, String nombre, double sueldo_base, double incentivos) {
		super(dni, nombre, sueldo_base);
        this.incentivos = incentivos;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public double salarioTotal() {
		double total = getSueldo_base() + this.incentivos;
		return total;
	}
	
	
	
}
