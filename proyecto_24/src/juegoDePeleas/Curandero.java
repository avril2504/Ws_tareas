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
		// TODO Auto-generated method stub
		
	}


	@Override
	protected boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
