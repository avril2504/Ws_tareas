package Herencia_Con_Empleados;

import java.util.ArrayList;

public class Director extends Empleado{
	private ArrayList<Empleado>listaEmpleadosDirector;

	
	public Director(String dni, String nombre, double sueldo_base) {
        super(dni, nombre, sueldo_base); // Llamada al constructor base
        this.listaEmpleadosDirector = new ArrayList<>();
    }

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleadosDirector;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleadosDirector = listaEmpleados;
	}

	@Override
	public double salarioTotal() {
		int empleados = listaEmpleadosDirector.size();
		double total = getSueldo_base() + (empleados * 100);
		return total;
	}
	public void agregarEmpleadoCargo(Empleado empleado) {
        listaEmpleadosDirector.add(empleado);
    }
	
	
	
}
