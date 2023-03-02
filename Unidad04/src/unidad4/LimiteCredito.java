package unidad4;

import java.util.Scanner;

public class LimiteCredito {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Pedir los datos del cliente
            System.out.print("Ingrese el número de cuenta (1 para terminar): ");
            int numeroCuenta = input.nextInt();
            
            // Verificar si se debe terminar el programa
            if (numeroCuenta == 1) {
                break;
            }
            
            System.out.print("Ingrese el saldo al inicio del mes: ");
            int saldoInicial = input.nextInt();

            System.out.print("Ingrese el total de todos los artículos cargados por el cliente en el mes: ");
            int cargos = input.nextInt();

            System.out.print("Ingrese el total de todos los créditos aplicados a la cuenta del cliente en el mes: ");
            int creditos = input.nextInt();

            System.out.print("Ingrese el límite de crédito permitido: ");
            int limiteCredito = input.nextInt();

            // Calcular el nuevo saldo y determinar si se excede el límite de crédito
            int nuevoSaldo = saldoInicial + cargos - creditos;
            System.out.printf("El nuevo saldo es: %d\n", nuevoSaldo);

            if (nuevoSaldo > limiteCredito) {
                System.out.println("Se excedió el límite de crédito.");
            }
        }

        input.close();
    }
}
