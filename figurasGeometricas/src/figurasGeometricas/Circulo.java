package figurasGeometricas;

public class Circulo {
	 private double radio;
	 // Constructor por defecto
	    public Circulo() {
	        this.radio = 1;
	    }

	    // Constructor con parámetros
	    public Circulo(double radio) {
	        if (radio < 1) {
	            System.out.println("Error: El radio no puede ser negativo o cero. Se asignará un valor de 1.");
	            this.radio = 1;
	        } else {
	            this.radio = radio;
	        }
	    }
	    
	    public void setRadio (double radio) {
	    	if (radio < 1) {
	            System.out.println("Error: El radio no puede ser negativo o cero.");
	        } else {
	            this.radio = radio;
	        }
	    }
	    
	    public double getRadio () {
	    	return this.radio; 
	    }

	    public double getPerimetro() {
	        return 2 * 3.1416 * this.radio;
	    }
	    
	    public double getArea() {
	        return 3.1416 * (this.radio * this.radio);
	    }
}
