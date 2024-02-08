package array;
import java.util.Scanner;
public class _03_Mayor_Elemento {
      public static void main(String[] args) {
            //Escribe un programa que solicite al usuario ingresar
            //el tamaño de un array de números enteros. A continuación
            //se le pedirá números hasta que el array esta lleno y por
            //último recorrerá el array para buscar el mayor número y lo imprimirá.
            Scanner sc = new Scanner(System.in);

            int num;
            int mayor = 0;
            
            System.out.println("Ingresa el tamaño del array");
            int tamaño = sc.nextInt();

            int[] num1 = new int [tamaño];
            for(int i = 0; i < tamaño; i++) {
                  System.out.println("Ingresa los números: ");
                  num1[i] = sc.nextInt();

                  }
            for(int i = 1; i < tamaño; i++) {
                  if(num1[i] > mayor) {

                	  mayor = num1[i];
                  }
            }
            System.out.println("El número mayor es: " + mayor);
      }

}