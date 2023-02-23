package unidad3;
import java.util.Scanner;
public class PruebaDeCuenta {
	   public static void main(String[] args) {
	        Cuenta_2 cuenta1 = new Cuenta_2("Jane Green", 50.00);
	    	Cuenta_2 cuenta2 = new Cuenta_2("John Blue", -7.53);

	        // muestra el saldo inicial de cada objeto
	        mostrarCuenta(cuenta1);
	        mostrarCuenta(cuenta2);

	        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (promt)
	        double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
	        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
	        cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

	        // muestra los saldos
	        mostrarCuenta(cuenta1);
	        mostrarCuenta(cuenta2);

	        System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (promt)
	        montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
	        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
	        cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2

	        // muestra los saldos
	        mostrarCuenta(cuenta1);
	        mostrarCuenta(cuenta2);
	    }

	    public static void mostrarCuenta(Cuenta_2 cuentaAMostrar) {
	        System.out.printf("Saldo de %s: $%.2f%n", cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
	    }
}
