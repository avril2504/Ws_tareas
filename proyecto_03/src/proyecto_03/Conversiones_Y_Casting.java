package proyecto_03;

public class Conversiones_Y_Casting {

	public static void main(String[] args) {
		
		//Conversión de Enteros a Flotante
		
		int Entero = 55;
		System.out.println(Entero);
		float conversion = Entero;
		System.out.println(conversion);
		//no se tiene que hacer casting
		//el resultado seria 55.0
		//no se pierde información
		
		
		//Conversión de Flotantes a Enteros
		
		float numeroF = 25.98f;
		System.out.println(numeroF);
		int entero = (int) numeroF;
		//es necesario hacer casting porque si no
		//da ERROR
		//el resultado seria 25
		//SI se pierde información
		System.out.println(entero);
		
		
		//Conversión de Double a Enteros 
		
		double decimal = 20.05;
		System.out.println(decimal);
		int entero01 = (int) decimal;
		System.out.println(entero01);
		//se debe de hacer casting si no da ERROR
		//el resultado es 20
		//se pierde información
		
		
		//Conversión de Entero a Double
		
		int numero01 = 65;
		System.out.println(numero01);
		double decimal02 = numero01;
		System.out.println(decimal02);
		//No es necesario hacer casting
		//el resultado seria 65.0
		//no se pierde información
		
		
		//Conversión de caracteres (char) a Enteros
		
		 char letra = 'f';
		 System.out.println(letra);
		 int numero02 = letra;
		 System.out.println(numero02);
		 //No es necesario hacer casting
		 //el resultado seria 102
		 //no se pierde información
		 
		 
		 //Conversión de Enteros a Caracteres
		 
		 int numero03 = 78;
		 System.out.println(numero03);
		 char letra02 = (char) numero03;
		 System.out.println(letra02);
		 //Es necesario hacer casting
		 //el resultado es N
		 //no se pierde información
		 
		 
		 //Conversión de Cadenas a Entero
		 
		 
		 String palabra = "cadenas";
		  //int entero03 = (String) palabra;
		 //int entero03 = palabra;
		 //de las dos formas da ERROR
		 
		 
		 //Conversión de Cadenas a Caracteres 
		 
		 String palabra02 = "hola";
		 //char palabra03 = (char) palabra02;
		 //char palabra03 = palabra02;
				 
		 
		 
		
	
		
		
		
		
		
		
	}

}
