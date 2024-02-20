package Ordenamiento;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Sort sort = new Sort();

        int[] array = null; // Declaración del arreglo
        int opcion;

        do {
            System.out.println("\nMenú de Ordenamiento:");
            System.out.println("1. Ingresar tamaño del arreglo");
            System.out.println("2. Ordenar con Bubble Sort");
            System.out.println("3. Ordenar con Selection Sort");
            System.out.println("4. Ordenar con Insertion Sort");
            System.out.println("5. Mostrar arreglo ordenado");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tamaño del arreglo: ");
                    int tamano = scanner.nextInt();
                    array = new int[tamano];
                    System.out.println("Arreglo de tamaño " + tamano + " creado.");
                    System.out.println("Ingrese los elementos...");
                    for(int i = 0; i<array.length; i++)
                        array[i] = scanner.nextInt();

                    sort.setArray(array);

                    break;
                case 2:
                    if (isNull(array))
                        sort.bubble_sort();
                    break;
                case 3:
                    if (isNull(array))
                        sort.selection_sort();
                    break;
                case 4:
                    if (isNull(array))
                        sort.insertion_sort();
                    break;
                case 5:
                    if (isNull(array))
                        sort.display_array();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);
    }

    public static boolean isNull(int[] array)
    {
        if (array == null)
        {
            System.out.println("Error: El arreglo no ha sido creado. Por favor, ingrese el tamaño del arreglo primero.");
            return false;
        }
        return true;
    }
}