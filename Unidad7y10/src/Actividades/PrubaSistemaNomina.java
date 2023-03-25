package Actividades;

public class PrubaSistemaNomina {
	public static void main(String[] args) 
	{
		// crea objetos de las subclases
		Salario empleadoAsalariado = new Salario("Roberto", "Dzul", "19530658", 800.00);
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Matin", "Gil", "19530659", 16.75, 40);
		  EmpleadoComision empleadoPorComision = new EmpleadoComision("Eduardo", "Roman", "19530660", 10000, .06);
		  Comision empleadoBaseMasComision = new Comision ("Carlos", "Chin", "444-444-444", 5000, .04, 300);
		
		  	System.out.println("Empleados procesados por separado:");
		
		  	System.out.printf("%n%s%n%s: $%,.2f%n%n",empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
		  	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
		  	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoBaseMasComision,"ingresos", empleadoBaseMasComision.ingresos());
		
		// crea un arreglo Empleado de cuatro elementos
		  	Nomina[] empleados = new  Nomina[4];
		
		// inicializa el arreglo con objetos Empleado
		  empleados[0] = empleadoAsalariado;
		  empleados[1] = empleadoPorHoras;
		  empleados[2] = empleadoPorComision;
		  empleados[3] = empleadoBaseMasComision;
		
	 System.out.println("Empleados procesados en forma polimorfica:\n");
	
	 // procesa en forma genérica a cada elemento en el arreglo de empleados
		
	 	for ( Nomina empleadoActual : empleados)
		 {
	 		System.out.println(empleadoActual);  // invoca a toString
		
	 		// determina si el elemento es un EmpleadoBaseMasComision
	 			if (empleadoActual instanceof Comision)
	 				{
	 					// conversión descendente de la referencia de Empleado
	 					// a una referencia de EmpleadoBaseMasComision
	 				Comision empleado =(Comision) empleadoActual; 
	 					empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
	 		
	 		
	 					System.out.printf("el nuevo salario base con 10%% de aumento es: $%,.2f%n",empleado.obtenerSalarioBase());
	 				} // fin de if
	 				
	 			System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
	 	  } // fin de for
	 				
	 	
	 	// obtiene el nombre del tipo de cada objeto en el arreglo de empleados
	 		for (int j = 0; j < empleados.length; j++)
	 			{
	 				System.out.printf("El empleado %d es un %s%n", j,empleados[j].getClass().getName());
	 			 } // fin de main
	 				

	}		
	

}

