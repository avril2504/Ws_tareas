package juegoDePeleas;

public class Curandero extends Personaje{

	private double sabiduria;

	public Curandero(String nombre, Arma arma, int puntosVida, double sabiduria) {
		super(nombre, arma, puntosVida);
		// TODO Auto-generated constructor stub
	}

	
	public double getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(double sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public int ArmaPersonaje() {
        int bonus = 0;
        if (getArma().getTipo() == tipoArma.REZO) {
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
	            System.out.println("El Curandero " + getNombre() + " va a hacer un daño de "
	                                + danio + " a " + p.getNombre());
	        } else {
	            System.out.println(getNombre() + " no puede atacar");
	        }
	    }
	}
}