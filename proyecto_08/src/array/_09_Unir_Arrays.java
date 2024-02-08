package array;

import java.util.Scanner;

public class _09_Unir_Arrays {

	public static void main(String[] args) {
		// Escribe un programa que solicite al usuario ingresar 
		//el tamaño de dos arrays de números enteros. A continuación 
		//se le pedirá números hasta que los arrays estén llenos. A continuación, 
		//el programa unirá los dos arrays en otro array más grande, y por último 
		//imprimirá la suma de todos los elementos de ese array nuevo.
		Scanner sc = new Scanner(System.in);


        System.out.println("Ingresa el tamaño del array");
        int tamaño = sc.nextInt();
        int[] num = new int [tamaño];
        for(int i = 0; i < tamaño; i++) {
              System.out.println("Ingresa los números: ");
              num[i] = sc.nextInt();
         
        }
        
        System.out.println("Ingresa el tamaño del otro array");
        int tamaño2 = sc.nextInt();
        int[] num2 = new int [tamaño2];
        for(int i = 0; i < tamaño2; i++) {
              System.out.println("Ingresa los otros números: ");
              num2[i] = sc.nextInt();
                 
        }
        
        int tamañoArray = tamaño + tamaño2;
        int[] array = new int [tamañoArray];
        
        for (int i = 0; i < tamaño2; i++) {
            array[i] = num[i];
        }
        
        for(int i = 0; i < tamaño2; i++) {
        	array[tamaño + i] = num2[i];
        }
        
        System.out.println("El nuevo array (formado por los dos anteriores) es: ");
        for(int numero : array) {
        	System.out.println(numero);
        }
        
        int suma = 0;
        for(int numero : array) {
        	suma += numero;
        }
        
        System.out.println("La suma de los elementos dentro del array es: " + suma);
        
   
	}

}
