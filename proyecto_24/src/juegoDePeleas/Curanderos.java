package juegoDePeleas;

public class Curanderos extends Personaje{
	private double sabiduria;

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
	
	
}
