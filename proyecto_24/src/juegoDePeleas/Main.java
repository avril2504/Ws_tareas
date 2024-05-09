package juegoDePeleas;

public class Main {

	public static void main(String[] args) {
		
		Arma arma = new Arma(tipoArma.ESPADA, 15);
		Personaje p1 = new Guerrero("Juan", arma, 100, 20.3);
		
		Arma arma2 = new Arma(tipoArma.REZO, 30);
		Personaje p2 = new Curandero("Juanjo", arma2, 100, 30);
		
		 boolean turnoDelGuerrero = true;
	        while (p1.getPuntosVida() > 0  && p2.getPuntosVida() > 0 ) {
	            if (turnoDelGuerrero) {
	                p1.atacar(p2);
	            } else {
	                p2.atacar(p1);
	            }
	            turnoDelGuerrero = !turnoDelGuerrero; // Cambiar turno
	        }

	        // Determinar y mostrar el ganador
	        if (p1.getPuntosVida() <= 0 ) {
	            System.out.println("El curandero " + p2.getNombre() + " gana!");
	        } else {
	            System.out.println("El guerrero " + p1.getNombre() + " gana!");
	        }
	}

}
