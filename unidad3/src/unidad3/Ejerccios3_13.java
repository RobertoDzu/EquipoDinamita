package unidad3;

public class Ejerccios3_13 {
	String PrimerNombre;
	String ApellidoPaterno;
	double SalarioMensual;
	public Ejerccios3_13() {
	}
	public Ejerccios3_13 (String PrimerNombre, String ApellidoPaterno, double SalarioMensual) {
		this.PrimerNombre=PrimerNombre;
		this.ApellidoPaterno=ApellidoPaterno;
		this.SalarioMensual=SalarioMensual;
	}
	public void establecerPrimerNombre(String PrimerNombre) {
		this.PrimerNombre=PrimerNombre;
	}
	public String obtenerPrimerNombre() {
		return this.PrimerNombre;
	}
	public void establecerApellidoPaterno(String ApellidoPaterno) {
		this.ApellidoPaterno=ApellidoPaterno;
	}
	public String obtenerApellidoPaterno() {
		return this.ApellidoPaterno;
	}
	public void establecerSalarioMensual(double SalarioMensual) {
		this.SalarioMensual = SalarioMensual;
	}
	public double obtenerSalarioMensual() {
		return this.SalarioMensual;
	}
}
