package array;
import java.util.Scanner;

public class _05_Eliminar_Duplicados {
    public static void main(String[] args) {
        // Escribe un programa que solicite al usuario ingresar
        // el tamaño de un array de números enteros. A continuación
        // se le pedirá números hasta que el array esté lleno.
        // El programa recorrerá el array para eliminar los números
        // duplicados y por último imprimirá el nuevo array.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del array");
        int tamaño = sc.nextInt();
        int[] num1 = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingresa los números: ");
            num1[i] = sc.nextInt();
        }

        // Encontrar la cantidad de elementos únicos
        int contador = 1;
        for (int i = 1; i < num1.length; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < i; j++) {
                if (num1[i] == num1[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                contador++;
            }
        }

        // Crear un nuevo array con elementos únicos
        int[] unicos = new int[contador];
        unicos[0] = num1[0];
        int index = 1;
        for (int i = 1; i < num1.length; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < index; j++) {
                if (num1[i] == unicos[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                unicos[index] = num1[i];
                index++;
            }
        }

        // Imprimir el nuevo array sin duplicados
        System.out.println("Nuevo array sin duplicados:");
        for (int numero : unicos) {
            System.out.print(numero + " ");
        }
    }
}//hecho con chatGPT no lo entiendo muy bien