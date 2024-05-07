package juegoDePeleas;

public abstract class Personaje {
	private String nombre;
	private Arma arma;
	private int puntosVida;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}	


	public abstract int ArmaPersonaje();

	
	public void atacar(Personaje p) {
		if(p.puntosVida <= 0 || this.puntosVida <= 0) {
			System.out.println("No se puede atacar porque unos de los personajes"
					+ "esta muerto");
		}
		
		int danio = ArmaPersonaje();
		
		if(danio > 0) {
			p.puntosVida -= danio;
		}
	}
}
