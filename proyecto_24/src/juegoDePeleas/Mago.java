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
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
