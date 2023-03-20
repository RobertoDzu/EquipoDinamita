package Actividades;

public class Salario extends Nomina {
	
	private double salarioSemanal;
	
	//constructor
	public Salario(String nombre, String apellidoPaterno, String numeroSocial, double salarioSemanal)
	{
		super(nombre, apellidoPaterno, numeroSocial);

		if(salarioSemanal<0.0)
		{
			throw new IllegalArgumentException("El salario semanal debe res  mayor o igual a 0.0");
		}
		
		this.salarioSemanal=salarioSemanal;

	}
	
	//establecer salario
	public void EstablecerSalarioSemanal(double salarioSemanal)
	{
		if(salarioSemanal<0.0)
		{
			throw new IllegalArgumentException("El salario semanal debe res  mayor o igual a 0.0");
		}
		
		this.salarioSemanal=salarioSemanal;
	}
	
	//obtener salario
	public double obtenerSalarioSemanal()
	{
		return salarioSemanal;
	}
	
	//calcula los ingres; sobre escribe el metodo abstracto ingreso en Empleado
	@Override
	public double ingresos()
	{
		return obtenerSalarioSemanal();
	}
	
	@Override
	public String toString()
	{
	return String.format("empleado asalariado: %s%n%s: $%,.2f",super.toString(), "Salario semanal", obtenerSalarioSemanal());
	}

	
	
	

}
