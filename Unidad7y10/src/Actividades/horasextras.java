package Actividades;
import java.util.Scanner;
class horasextras {

/**
 * @param args
 */
public static void main(String[] args) {
    try (// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in)) {
		long horasTrabajadas;
		long pagoxhora;
		long salario;

		System.out.print("Ingrese las horas trabajadas: ");
		horasTrabajadas=entrada.nextLong();
		System.out.print("Ingrese el pago por horas: ");
		pagoxhora=entrada.nextLong();
		
		if(horasTrabajadas<=40){
		}
		else{
		pagoxhora= (pagoxhora/2)+pagoxhora;
		}
		salario= horasTrabajadas*pagoxhora;
		System.out.println("El salario es de: "+salario);
	}
}

}