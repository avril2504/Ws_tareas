package juegoDePeleas;

public class Main {

	public static void main(String[] args) {
		
		Arma arma = new Arma(tipoArma.ESPADA, 15);
		Personaje p1 = new Guerrero("Juan", arma, 100, 20.3);
		
		Arma arma2 = new Arma(tipoArma.REZO, 30);
		Personaje p2 = new Curandero("Juanjo", arma2, 100, 30);
		
		Combate combate = new Combate();
		combate.empezarCombate(p1, p2);
	}

}
