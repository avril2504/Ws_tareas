package array;

import java.util.Arrays;
import java.util.Scanner;

public class _10_Eliminar_Elemento_Especifico {

	public static void main(String[] args) {
		//Escribe un programa que permita al usuario ingresar un valor
		//y elimine todas las ocurrencias de ese valor en un array creado 
		//al inicio del programa. Muestra el array resultante.
        Scanner sc = new Scanner(System.in);
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("A continuación, el número que ingrese se eliminara del array creado");
        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();
        
        int contador = 0;
        for(int i = 0; i < array.length; i++) {
        	if(array[i] == numero) {
        		contador++;
        	}
        }
        
        int[] nuevoArray = new int [array.length - contador];
        int j = 0;
        
        for(int i = 0; i < array.length; i++) {
        	if (array[i] != numero) {
        		nuevoArray[j] = array[i];
        		j++;
        	}
        	
        }
        
        System.out.println("El nuevo array es: " + Arrays.toString(nuevoArray));

        	
        }
        


	}


