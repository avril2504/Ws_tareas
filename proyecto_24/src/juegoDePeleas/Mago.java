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
	public boolean atacar(Personaje p) {
        if (this.getPuntosVida() <= 0 || p.getPuntosVida() <= 0) {
            System.out.println("No se puede atacar porque uno de los personajes está muerto");
        }
    		int danio = ArmaPersonaje();
    		
    		if(danio > 0) {
    			int danioTotal = p.getPuntosVida() - danio;
    			System.out.println("El Mago " + getNombre() + " va a hacer un daño de "
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
