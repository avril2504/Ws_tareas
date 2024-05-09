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

	
	public boolean atacar(Personaje p) {
        if (this.puntosVida <= 0 || p.puntosVida <= 0) {
            System.out.println("No se puede atacar porque uno de los personajes está muerto");
        }
    		int danio = ArmaPersonaje();
    		
    		if(danio > 0) {
    			int danioTotal = p.puntosVida - danio;
    			System.out.println("El Personaje " + this.nombre + " va a hacer un daño de "
						+ danioTotal + " a " + p.nombre);
    			if(p.puntosVida > 0) {
    				return true;
    			}
    		}else{
    		System.out.println(this.nombre + " no puede atacar");
    	}
    	return false;
    }

}
