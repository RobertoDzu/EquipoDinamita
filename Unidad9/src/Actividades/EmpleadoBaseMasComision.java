package Actividades;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	private double salarioBase;

	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) { 
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas,tarifaComision);
	 
	this.salarioBase = salarioBase;
	}

	public double ingresos() {
	return salarioBase + super.ingresos();
	}

	public String toString() {
	return String.format("empleado con salario base más comisión: %s%nsalario base: $%,.2f",super.toString(), salarioBase);
	}
	}
