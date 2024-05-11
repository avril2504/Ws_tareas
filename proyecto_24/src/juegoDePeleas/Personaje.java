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
	public void setArma(Arma tipoArma) {
		this.arma = tipoArma;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}	
	
	public Personaje(String nombre, Arma arma, int puntosVida) {
		super();
		this.nombre = nombre;
		this.arma = arma;
		this.puntosVida = puntosVida;
	}
	public abstract int ArmaPersonaje();

	
	public void atacar(Personaje p) {
	    if (this.getPuntosVida() <= 0 || p.getPuntosVida() <= 0) {
	        System.out.println("No se puede atacar porque uno de los personajes está muerto");
	    } else {
	        int danio = ArmaPersonaje();
	        
	        if (danio > 0) {
	            int danioTotal = p.getPuntosVida() - danio;
	            if (danioTotal > 0) {
	                p.setPuntosVida(danioTotal);
	            } else {
	                p.setPuntosVida(0); // Asegura que los puntos de vida no sean negativos
	            }
	            System.out.println("El Personaje " + getNombre() + " va a hacer un daño de "
	                                + danio + " a " + p.getNombre());
	        } else {
	            System.out.println(getNombre() + " no puede atacar");
	        }
	    }
	}
}

