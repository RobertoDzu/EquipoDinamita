package unidad4;

import java.util.Scanner;

public class CalculadoraComisiones {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir los valores de los artículos vendidos
        System.out.print("Ingrese el valor del artículo 1: ");
        double articulo1 = input.nextDouble();

        System.out.print("Ingrese el valor del artículo 2: ");
        double articulo2 = input.nextDouble();

        System.out.print("Ingrese el valor del artículo 3: ");
        double articulo3 = input.nextDouble();

        System.out.print("Ingrese el valor del artículo 4: ");
        double articulo4 = input.nextDouble();

        // Calcular el total de ventas y la comisión
        double totalVentas = articulo1 + articulo2 + articulo3 + articulo4;
        double comision = 200 + 0.09 * totalVentas;

        // Mostrar el ingreso total
        System.out.printf("El ingreso total del vendedor es: $%.2f\n", comision);

        input.close();
    }
}
