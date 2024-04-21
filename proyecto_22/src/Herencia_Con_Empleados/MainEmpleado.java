package Herencia_Con_Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEmpleado {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Bienvenido");
    	System.out.println("Seleccione la opcion que desee");
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("----------Menú----------");
            System.out.println("1. Dar de alta empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Calcular salario de empleado");
            System.out.println("4. Calcular costes totales de la empresa");
            System.out.println("5. Salir del programa");
            
            int opcion = sc.nextInt();
            if (opcion == 5) {
                System.out.println("Saliste del programa");
                break;
            }
            
            switch (opcion) {
                case 1:
                    altaEmpleado();
                    break;
                case 2:
                    mostrarEmpleados();
                    break;
                case 3:
                    calcularSalarioEmpleado();
                    break;
                case 4:
                    calcularCostesTotalesDeLaEmpresa();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
        sc.close();
    }


    public static void altaEmpleado() {
        sc.nextLine();
        System.out.println("Introduzca el nombre del empleado");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el DNI");
        String dni = sc.nextLine();
        System.out.println("Introduzca el sueldo base");
        double sueldo_base = sc.nextDouble();

        System.out.println("Introduce el tipo de Empleado:");
        for (int i = 0; i < TipoEmpleado.values().length; i++) {
            System.out.println((i + 1) + ". " + TipoEmpleado.values()[i]);
        }

        int opcion = sc.nextInt() - 1;

        switch (opcion) {
            case 0:
                empleados.add(new Programador(dni, nombre, sueldo_base));
                break;
            case 1:
                System.out.println("Introduzca los incentivos del jefe de proyecto");
                double incentivos = sc.nextDouble();
                empleados.add(new JefeProyecto(dni, nombre, sueldo_base, incentivos));
                break;
            case 2:
            	 Director director = new Director(dni, nombre, sueldo_base);
                 asignarEmpleadosADirector(director);
                 empleados.add(director);
                 break;
             default:
                 System.out.println("Opción no válida.");
         }
     }


    private static void asignarEmpleadosADirector(Director director) {
        System.out.println("Selecciona los empleados que estarán a cargo del Director (separados por comas):");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
        }
        
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        String seleccion = sc.nextLine().trim();
        if (!seleccion.isEmpty()) { 
            String[] indices = seleccion.split(",");
            for (String indice : indices) {
                try {
                    int nroIndice = Integer.parseInt(indice.trim()) - 1;
                    if (nroIndice >= 0 && nroIndice < empleados.size()) {
                        director.agregarEmpleadoCargo(empleados.get(nroIndice));
                    } else {
                        System.out.println("Índice inválido.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Selección inválida. Asegúrate de introducir números.");
                }
            }
        	}else{
            System.out.println("No se seleccionó ningún empleado.");
        }
    }


    private static void mostrarEmpleados() {
        System.out.println("Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("ID: " + empleado.getId());
            System.out.println("DNI: " + empleado.getDni());
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Sueldo base: " + empleado.getSueldo_base());
            
            if (empleado instanceof Director) {
                Director director = (Director) empleado;
                System.out.println("  Empleados a cargo:");
                for (Empleado subordinado : director.getListaEmpleados()) {
                    System.out.println("    - " + subordinado.getNombre());
                }
            }
        }
    }

    private static void calcularSalarioEmpleado() {
        System.out.println("Selecciona el empleado para calcular su salario:");
        mostrarEmpleados();
        
        int seleccion = sc.nextInt();
        if (seleccion >= 1 && seleccion <= empleados.size()) {
            Empleado empleado = empleados.get(seleccion - 1);
            System.out.println("El salario total de " + empleado.getNombre() + " es: " + empleado.salarioTotal());
        } else {
            System.out.println("Selección inválida.");
        }
    }

    public static void calcularCostesTotalesDeLaEmpresa() {
        double costesTotales = 0;
        for (Empleado empleado : empleados) {
            costesTotales += empleado.salarioTotal();
        }
        System.out.println("El coste total de la empresa es: " + costesTotales);
    }
}
