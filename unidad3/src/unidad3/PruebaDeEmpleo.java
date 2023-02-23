package unidad3;

public class PruebaDeEmpleo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejerccios3_13 empleado1 = new Ejerccios3_13 ("Roberto","Dzul", 5400);
		
		System.out.println("El salario anual de "+ empleado1.obtenerPrimerNombre()+""+ empleado1.obtenerApellidoPaterno()+" es de: "+ String.format("%.2f", empleado1.obtenerSalarioMensual()*12));
		System.out.println("El salario anual de "+ empleado1.obtenerPrimerNombre()+ " mas el 10% es de:"+ String.format("%.2f", empleado1.obtenerSalarioMensual()*12*1.1));
		
		Ejerccios3_13 empleado2 = new Ejerccios3_13 ("Eduardo","Araujo", 4800);
		
		System.out.println("El salario anual de "+ empleado2.obtenerPrimerNombre()+""+ empleado2.obtenerApellidoPaterno()+" es de: "+ String.format("%.2f", empleado2.obtenerSalarioMensual()*12));
		System.out.println("El salario anual de "+ empleado2.obtenerPrimerNombre()+ " mas el 10% es de:"+ String.format("%.2f", empleado2.obtenerSalarioMensual()*12*1.1));
		
	}
}
