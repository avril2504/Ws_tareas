package entidades;

import java.util.List;

public class Concesionario {
	private String nombre;
	private String direccion;
	private List<Vehiculo> ListaVehiculos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Vehiculo> getListaVehiculos() {
		return ListaVehiculos;
	}
	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		ListaVehiculos = listaVehiculos;
	}
	
	public int getNumeroMotosConSidecar() {
		int contador = 0;
		for(Vehiculo v : ListaVehiculos) {
			if(v instanceof Moto) {
				Moto moto = (Moto)v;
				if(moto.isTieneSidecar()) {
					contador ++;
				}
			}
		}
		return contador; 
	}
}
