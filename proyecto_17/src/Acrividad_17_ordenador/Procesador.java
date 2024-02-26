package Acrividad_17_ordenador;

public class Procesador {
	private String marca;
	private String modelo;
	private int nucleos;
	private double precio;
	
	public Procesador(String marca, String modelo, int nucleos, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
