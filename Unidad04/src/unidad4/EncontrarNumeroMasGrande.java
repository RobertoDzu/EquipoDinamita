package unidad4;

import java.util.Scanner;

public class EncontrarNumeroMasGrande {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mayor = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.print("Ingrese un número entero: ");
            int numero = input.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            contador++;
        }

        System.out.printf("El número más grande es: %d%n", mayor);

        input.close();
    }
}
