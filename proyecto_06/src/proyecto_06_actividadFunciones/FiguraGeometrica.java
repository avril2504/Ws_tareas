package proyecto_06_actividadFunciones;

public class FiguraGeometrica {

	public static void main(String[] args) {
		// cuadrado
		area(5, 5);

		// circulo
		area(20);

		// triangulo
		area(5, 7.5);

	}

	// cuadrado
	public static void area(int l, int l2) {
		int area = l * l2;
		System.out.println("El área del cuadrado es: " + area);
	}

	// circulo
	public static void area(double r) {
		final double pi = 3.14;
		double area = pi * (r * r);
		System.out.println("El área del circulo es: " + area);
	}

	// triángulo
	public static void area(double b, double a) {
		double area = (b * a) / 2;
		System.out.println("El área del triángulo es: " + area);
	}

}
