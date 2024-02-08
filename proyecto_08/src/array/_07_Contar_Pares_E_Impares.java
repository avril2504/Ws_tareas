
package array;
import java.util.Scanner;
public class _07_Contar_Pares_E_Impares {
      public static void main(String[] args) {
            //Escribe un programa que solicite al usuario ingresar
            //el tamaño de un array de números enteros. A continuación
            //se le pedirá números hasta que el array esta lleno.
            //El programa contará el número de pares e impares que hay
            //en el array y mostrará dicha cuenta por pantalla.
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingresa el tamaño del array");
            int tamaño = sc.nextInt();
            int[] num = new int [tamaño];
            for(int i = 0; i < tamaño; i++) {
                  System.out.println("Ingresa los números: ");
                  num[i] = sc.nextInt();

                  }

            int pares = 0;
            int impares = 0;

            System.out.println("Números pares: ");
            for(int i = 0; i < tamaño; i++) {
                  if(num[i] % 2 == 0) {
                  System.out.println(num[i]);
                  pares++;

            }

      }

            System.out.println("Números impares: ");
            for(int i = 1; i < tamaño; i++) {
                  if(num[i] % 2 != 0) {
                  System.out.println(num[i]);
                  impares++;

               }

            }

            System.out.println("Total de números pares: " + pares);
            System.out.println("Total de números pares: " + impares);

      }

}

 

 

 