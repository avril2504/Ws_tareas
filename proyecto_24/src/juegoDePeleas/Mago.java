package juegoDePeleas;

public class Mago extends Personaje{
	

	public Mago(String nombre, Arma arma, int puntosVida, double inteligencia) {
		super(nombre, arma, puntosVida);
		this.inteligencia = inteligencia;
	}

	private double inteligencia;

	public double getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}

	
	@Override
	public int ArmaPersonaje() {
        int bonus = 0;
        if (getArma().getTipo() == tipoArma.HECHIZO) {
            bonus = 10; // Bonus para armas de guerreros
        }
        return (int) (getArma().getDanio() + bonus);
	}

	@Override
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
	            System.out.println("El Mago " + getNombre() + " va a hacer un daño de "
	                                + danio + " a " + p.getNombre());
	        } else {
	            System.out.println(getNombre() + " no puede atacar");
	        }
	    }
	}
}