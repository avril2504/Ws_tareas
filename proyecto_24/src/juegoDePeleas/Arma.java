package juegoDePeleas;

public class Arma {
	private tipoArma tipo;
	private double danio;
	
	
	public Arma(tipoArma tipo, double danio) {
		super();
		this.tipo = tipo;
		this.danio = danio;
	}
	public tipoArma getTipo() {
		return tipo;
	}
	public void setTipo(tipoArma tipo) {
		this.tipo = tipo;
	}
	public double getDanio() {
		return danio;
	}
	public void setDanio(double danio) {
		this.danio = danio;
	}
	

	
}
