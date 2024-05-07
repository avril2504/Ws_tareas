package juegoDePeleas;

public class Guerrero extends Personaje{
	private double fuerza;

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
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub
		
	}

}


