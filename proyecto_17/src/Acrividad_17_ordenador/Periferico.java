package Acrividad_17_ordenador;

public class Periferico {
	private String tipo;
	private String marca;
	private double precio;
	
	public Periferico(String tipo, String marca, double precio) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
