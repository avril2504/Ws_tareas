package proyecto_04;

import java.util.Scanner;

public class Entrada_Y_Salida_De_Datos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//sc.nextLine();
		System.out.println("escriba una frase");
		sc.nextLine();
		String frase = sc.nextLine();
		System.out.println("escribiste una frase:" + frase);
		
		System.out.println("escriba otra frase:");
		frase = sc.nextLine();
		System.out.println("su segunda frase es:" + frase);
		
		System.out.println("escriba un número");
		String n1 = sc.nextLine();
		System.out.println("muy bien, escriba otros dos numeros");
		String n2 = sc.nextLine();
		String n3 = sc.nextLine();
		String n4 = n1 + n3;
		System.out.println("la concatación de n1 y n3 es:" + n4);
		
		//La variable String nos permite escribir frases y números
		
		//nextInt()
		
		System.out.println("escribe un número Int");
		int p1 = sc.nextInt();
		System.out.println("escribe otro número Int");
	    int p2 = sc.nextInt();
	    int p3 = p1 + p2;
	    System.out.println("El resultado de la suma de p1 y p2 es:" + p3);
	    
	    //Si se introduce una frase en la variable "Int" daria error
	    
	    //nextlong
	    
	    System.out.println("escriba un long:");
	    long a1 = sc.nextLong();
	    System.out.println("escribiste el número:" + a1);
	    
	    //daria error si introduzco un double 
	    
	    //nextDouble
	    
	    System.out.println("escribe un Double");
	    double d1 = sc.nextDouble();
	    System.err.println("escribiste:" + d1);
	    double d2 = sc.nextDouble();
	    System.out.println("escribiste:" + d2);
	    double d3 = d1 - d2;
	    System.out.println("la resta de d1 y d2 es:" + d3);
	    
	    //Si se introduce un long daria error
	    
	    //nextfloat
	    
	    System.out.println("escribe un float:");
	    float f1 = sc.nextFloat();
	    System.out.println("escribiste:" + f1);
	    
	    //Daria erros si introduzco un punto en lugar de coma para separalo
	    
	    //booleana
	     System.out.println("introduce una booleana true:");
	     boolean b1 = sc.nextBoolean();
	     boolean b2 = sc.nextBoolean();
	     System.out.println("introduce una boolean false" + b2);
	     
	     // daria error si escribo otra cosa que no sea true o false
	     
	     //Byte
	     System.out.println("escribe un número byte");
	     byte B1 = sc.nextByte();
	     System.out.println("escribe otro número byte");
	     byte B2 = sc.nextByte();
	     
	     //Daria un error si se intruce un números
	   
	}

}
