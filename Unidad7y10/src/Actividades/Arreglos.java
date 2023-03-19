package Actividades;

import java.util.Arrays;

public class Arreglos {
	public static void main(String[] args) {
        // a)Asignar cero a los 10 elementos del arreglo cuentas de tipo entero.
        int[] cuentas = new int[10];

        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 0;
        }

        // a)Asignar cero a los 10 elementos del arreglo cuentas de tipo entero.
        Arrays.fill(cuentas, 0);

        mostrarArreglo(cuentas, "cuentas");
        System.out.println();

        // b)Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero
        int[] bono = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

        for (int i = 0; i < bono.length; i++) {
            bono[i]++;
        }

        mostrarArreglo(bono, "bono");
        System.out.println();

        // c)Imprima los cinco valores del arreglo mejoresPuntuaciones de tipo entero en formato de columnas.
        int[] mejoresPuntuaciones = {100, 90, 80, 70, 60};
        System.out.println("MEJORES PUNTUACIONES");
        System.out.printf("%d%11d%10d%10d%10d%n", 1, 2, 3, 4, 5);

        Arrays.sort(mejoresPuntuaciones);
        for (int puntuacion : mejoresPuntuaciones) {
            System.out.printf("%d        ", puntuacion);
        }
    }

    public static void mostrarArreglo(int[] arreglo, String nombreArreglo) {
        System.out.printf("El arreglo %s tiene los siguientes elementos:%n", nombreArreglo);

        for (int elemento : arreglo) {
            System.out.printf("%d ", elemento);
        }

        System.out.println();
    }
}

