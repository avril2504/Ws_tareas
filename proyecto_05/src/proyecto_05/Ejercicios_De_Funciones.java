     package proyecto_05;

public class Ejercicios_De_Funciones {

	public static void main(String[] args) {
		//Ejerciicio 1
		menu();
		menu();
		menu();
		
		//Ejercicio 2
		perimetroRectangulo(10, 30);
		perimetroRectangulo(25, 10);
		
		//Ejercicio 3
        System.out.println("El perimetro del rectangulo es:" + perimetroRectangulo2(10, 20));
        System.out.println("El perimetro del rectangulo es:" + perimetroRectangulo2(15, 30));
        
        //Ejercicio 4
       System.out.println("El area del rectangulo es: " + area(2, 10));
       System.out.println("El area del rectangulo es: " + area(5, 15));
       
       //Ejerciciom 5
       System.out.println("La hipotenusa es: " + hipotenusa(25,90)); 
       System.out.println("La hipotenusa es: " + hipotenusa(4,13)); 
       
       //Ejercico 6
       System.out.println("La suma es :" + suma(5, 20));
       System.out.println("La resta es: " + resta(56, 40));
       System.out.println("La división es: " + division(10, 2));
       System.out.println("La multiplicación es: " + multiplicación(2, 3));
       
       //Ejercicio 7
       medida(10, 20, 30);
       medida(5, 10, 15); 
       
       //Ejercicio 8
       System.out.println("La nota final es: " + nota(7, 8, 8, 10, 9));
       System.out.println("La nota final es: " + nota(10, 9, 9, 10, 9));
       
       //Ejercicio 9
       salarioTotal(1000, 8, 50);
       salarioTotal(1500,10, 6.5);
       
	}//fin del metodo main

        //Ejercico 1
public static void menu() {
	System.out.println("Entrar en la aplicación");
	System.out.println("Registrarse en la aplicación");
	System.out.println("Salir del programa");
  }

       //Ejercicio 2
public static void perimetroRectangulo(int base, int altura) {
	int perimetro = 2 * (base + altura);
	System.out.println("El perimetro de un rectagulo es:" + perimetro);
}

      //Ejercicio 3
public static int perimetroRectangulo2(int base, int altura) {
	int perimetro = 2 * (base + altura);
	return perimetro;
	
}
	//Ejrcicio 4
public static int area(int base, int altura) {
	int area = base * altura;
	return area;
	
}

	//Ejercio 5
public static double hipotenusa(double cateto1, double cateto2) {
	double hipotenusa = Math.sqrt(cateto1 * cateto2 + cateto1 + cateto2);
	return hipotenusa;
	
}

	//Ejercicio 6
public static int suma (int n1, int n2) {

    int suma = n1 + n2;

    return suma;
}

public static int resta (int n1, int n2) {

    int resta = n1 - n2;

    return resta;
}

public static int division (int n1, int n2) {

    int division = n1 / n2;

    return division;
}
public static int multiplicación (int n1, int n2) {

    int multiplicación = n1 * n2;

    return multiplicación;
}
//Ejercicio 7
public static void medida (int n1, int n2, int n3){

    double medida = (n1 + n2 + n3) / 3;

    System.out.println("LA medida de " + n1 + "," + n2 + "," + n3 + " es: " + medida);

}
//Ejercio 8
public static double nota (double p1, double p2, double p3, double examen, double trabajo) {
	
	double parcial = (p1 + p2 + p3) / 3;
	
	double notaFinal = (parcial * 0.55) + (examen * 0.30) + (trabajo * 0.15);
	
	return notaFinal;
}
//Ejercico 9
public static void salarioTotal (double salarioB, double HorasExtra, double PrecioHorasExtra) {
	
	double salarioTotal = salarioB + (HorasExtra * PrecioHorasExtra);
	
	System.out.println("El salario Final es: " + salarioTotal);
}



    }
