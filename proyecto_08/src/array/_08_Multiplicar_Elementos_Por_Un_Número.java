
package array;
import java.util.Scanner;
public class _08_Multiplicar_Elementos_Por_Un_Número {
      public static void main(String[] args) {
            //Escribe un programa que solicite al usuario ingresar
            //el tamaño de un array de números enteros. A continuación
            //se le pedirá números hasta que el array esta lleno y por
            //último imprimirá la multiplicación de todos los elementos.
            Scanner sc = new Scanner(System.in);


            System.out.println("Ingresa el tamaño del array");
            int tamaño = sc.nextInt();
            int[] num = new int [tamaño];
            for(int i = 0; i < tamaño; i++) {
                  System.out.println("Ingresa los números: ");
                  num[i] = sc.nextInt();

                  int num2 = 1;
                  do {
                  	int tabla = num[i] * num2;
                  	num2++;
                  	System.out.println(num[i] + "x" + num2  + "es: " + tabla);
                  	
                  }while(num2 <= 10);
                  
                  }
      	}

}