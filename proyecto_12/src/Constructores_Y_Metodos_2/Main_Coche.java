package Constructores_Y_Metodos_2;

import java.util.Scanner;

public class Main_Coche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Coche coche1 = new Coche();
		Coche coche2 = new Coche(24643, "ola", "r43", 50000, "01/01/1970", 35000);
		
		
		coche1.id = 12345678;
		coche1.precio = 25000.0;
		coche1.fecha_matriculacion = "02/04/2000";
		coche1.kilometros = 40000;
		
		coche1.datos();
		coche1.precio_base();
		coche1.anio_matriculacion();
		coche1.anio_bisiesto();
		coche1.precio_kilometros();
		coche1.primos_kilometros();
		coche1.falta_kilometros();
		coche1.caracteres();
		coche1.diferencia(coche2);
		coche1.masCaro(coche2);

	}

}
