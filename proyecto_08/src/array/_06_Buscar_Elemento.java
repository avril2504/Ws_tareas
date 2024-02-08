package array;
import java.util.Scanner;
public class _06_Buscar_Elemento {
      public static void main(String[] args) {
            //Desarrolla un programa que permita al usuario
            //ingresar un valor y determine si ese valor está
            //presente en un array dado. Se tendrá que crear
            //un array con valores al inicio del programa.
            Scanner sc = new Scanner(System.in);

            int[] array = {1, 2, 3, 4, 5};
            System.out.println("Introduzca un número para saber si esta presente en el array: ");
            int num = sc.nextInt();
            boolean encontrado = false;
            for(int buscar : array) {
                  if(buscar == num) {
                  encontrado = true;
                  break;
                  }

            }

            if(encontrado) {
                  System.out.println("Este número se encuentra en el array");
            }else {
                  System.out.println("Este número no se encuentra en el array");
            }


      }

 
}