package juegoDePeleas;

public class Guerrero extends Personaje{
	private double fuerza;
	

	public Guerrero(String nombre, Arma arma, int puntosVida, double fuerza) {
		super(nombre, arma, puntosVida);
		this.fuerza = fuerza;
	}

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public int ArmaPersonaje() {
        int bonus = 0;
        if (getArma().getTipo() == tipoArma.ESPADA || getArma().getTipo() == tipoArma.ARCO) {
            bonus = 10; // Bonus para armas de guerreros
        }
        return (int) (getArma().getDanio() + bonus);
    }
	
	@Override
	public boolean atacar(Personaje p) {
        if (this.getPuntosVida() <= 0 || p.getPuntosVida() <= 0) {
            System.out.println("No se puede atacar porque uno de los personajes está muerto");
        }
    		int danio = ArmaPersonaje();
    		
    		if(danio > 0) {
    			int danioTotal = p.getPuntosVida() - danio;
    			System.out.println("El Guerrero " + getNombre() + " va a hacer un daño de "
						+ danioTotal + " a " + p.getNombre());
    			if(p.getPuntosVida() > 0) {
    				return true;
    			}
    		}else{
    		System.out.println(getNombre() + " no puede atacar");
    	}
    	return false;
    }


}


