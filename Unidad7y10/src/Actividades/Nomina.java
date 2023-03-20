package Actividades;

public class Nomina {
	

		private final String nombre;
		private final String apellidoPaterno;
		private final String numeroSocial;
		
		//constructor
		public Nomina (String nombre, String apellidoPaterno, String numeroSocial )
		{
			this.nombre=nombre;
			this.apellidoPaterno=apellidoPaterno;
			this.numeroSocial=numeroSocial;
			
		}
		
		//obtener................................ 
		public String obtenerNombre()
		{
			return nombre;
		}
		public String obtenerApellidoPaterno()
		{
			return apellidoPaterno;
		}
		public String obtenerNumeroSocial()
		{
			return numeroSocial;
		}
		
		@Override
		public String toString()
		{
			return String.format("%s %s%nnumero de seguro social: %s",obtenerNombre(), obtenerApellidoPaterno(),obtenerNumeroSocial());
		}

		public double ingresos() {
			return 0;
		} 
			
		

		
}