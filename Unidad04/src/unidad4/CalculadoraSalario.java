package unidad4;

import java.util.Scanner;

public class CalculadoraSalario {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Empleado %d%n", i);

            System.out.print("Ingrese las horas trabajadas: ");
            int horasTrabajadas = input.nextInt();

            System.out.print("Ingrese la tarifa por hora: ");
            double tarifaPorHora = input.nextDouble();

            double salarioBruto = calcularSalarioBruto(horasTrabajadas, tarifaPorHora);

            System.out.printf("El salario bruto del empleado %d es de: $%.2f%n%n", i, salarioBruto);
        }

        input.close();
    }

    public static double calcularSalarioBruto(int horasTrabajadas, double tarifaPorHora) {
        double salarioBruto = 0;

        if (horasTrabajadas <= 40) {
            salarioBruto = horasTrabajadas * tarifaPorHora;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;
            double tarifaPorHoraExtra = tarifaPorHora * 1.5;

            salarioBruto = horasNormales * tarifaPorHora + horasExtras * tarifaPorHoraExtra;
        }

        return salarioBruto;
    }
}
