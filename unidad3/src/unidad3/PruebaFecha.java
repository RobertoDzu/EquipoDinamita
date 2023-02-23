package unidad3;

import java.util.Scanner;

public class PruebaFecha {
	public static void main(String[] args) {
		
        int dia;
        int mes; 
        int año;
       
        Fecha fecha = new Fecha( 0 , 0 , 0 );
       
        fecha.mostrarFecha();
       
        Scanner entrada = new Scanner( System.in );
			System.out.print( "\nEscriba el número del mes: " );
			mes = entrada.nextInt();
			fecha.establecerMes( mes );
      
			System.out.print( "\nEscriba el número del día: " );
			dia = entrada.nextInt();
			fecha.establecerDia( dia );
      
			System.out.print( "\nEscriba el año: " );
			año = entrada.nextInt();
 
        fecha.establecerAño( año );

        fecha.mostrarFecha();
    } 
}
