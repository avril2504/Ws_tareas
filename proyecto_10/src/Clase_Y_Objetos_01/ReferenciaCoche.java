package Clase_Y_Objetos_01;

public class ReferenciaCoche {

	public static void main(String[] args) {
		//primer coche
		
		Coche primerCoche = new Coche();
		primerCoche.marca = "Ferrari";
		primerCoche.modelo = "F40";
		primerCoche.matricula = "1234_BCD";
		primerCoche.peso = 1100;
		primerCoche.años = 5;
		primerCoche.electrico = true;

		//segundo coche
		
		Coche segundoCoche = new Coche();
		segundoCoche.marca = "Toyota";
		segundoCoche.modelo = "Rav4";
		segundoCoche.matricula = "1258_BED";
		segundoCoche.peso = 1900;
		segundoCoche.años = 3;
		segundoCoche.electrico = true;

		
		//tercer coche
		
		Coche tercerCoche = new Coche();
		tercerCoche.marca = "lamborghini";
		tercerCoche.modelo = "Huracan";
		tercerCoche.matricula = "1379_AED";
		tercerCoche.peso = 1400;
		tercerCoche.años = 4;
		tercerCoche.electrico = true;
		
		imprimir(primerCoche);
		System.out.println();
		imprimir(segundoCoche);
		System.out.println();
		imprimir(tercerCoche);

	}
	public static void imprimir (Coche c) {
		System.out.println(c.marca);
		System.out.println(c.modelo);
		System.out.println(c.matricula);
		System.out.println(c.peso);
		System.out.println(c.años);
		System.out.println(c.electrico);
		
	}

}
