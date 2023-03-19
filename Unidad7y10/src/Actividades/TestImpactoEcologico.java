package Actividades;

import java.util.ArrayList;

public class TestImpactoEcologico {
	 public static void main(String[] args) {
	        ArrayList<ImpactoEcologico> lista = new ArrayList<ImpactoEcologico>();
	        
	        Edificio edificio = new Edificio(1000);
	        Auto auto = new Auto(2000);
	        Bicicleta bicicleta = new Bicicleta();
	        
	        lista.add(edificio);
	        lista.add(auto);
	        lista.add(bicicleta);
	        
	        for (ImpactoEcologico objeto : lista) {
	            System.out.println("Tipo de objeto: " + objeto.getClass().getSimpleName());
	            System.out.println("Impacto ecológico: " + objeto.obtenerImpactoEcologico());
	            System.out.println();
	        }
	    }
}
