package Actividades;
import java.util.Scanner;

/*
 * @author tutorias.co
 */

public class NominaSalario {

    /**
     * se crea el canal de entrada de datos con scanner
     */
    static Scanner entrada = new Scanner(System.in);
    static double salario;
    
    public static void main(String[] args) {
        // se instancia la clase Conversion y se invocan los metodos
        NominaSalario solucion = new NominaSalario();
        do{
            System.out.print("Favor ingresar salario: ");
            salario = entrada.nextDouble(); 
            if(salario == 200000 || salario == 400000 || salario == 600000 ||salario == 800000 ||salario == 1000000){ 
                solucion.sumarACategoria(salario);
                solucion.sumarANomina(salario);
            }            
            System.out.print("\n¿Desea continuar? si/no: ");
        }while(entrada.next().equalsIgnoreCase("si"));
        solucion.mostrarResultado();
    }

	void mostrarResultado() {
		// TODO Auto-generated method stub
		
	}

	void sumarANomina(double salario2) {
		// TODO Auto-generated method stub
		
	}

	void sumarACategoria(double salario2) {
		// TODO Auto-generated method stub
		
	}
}