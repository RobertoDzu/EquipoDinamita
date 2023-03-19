package Actividades;

interface ImpactoEcologico {
	    double obtenerImpactoEcologico();
	}

	class Edificio implements ImpactoEcologico {
	    private double consumoEnergia;
	    
	    public Edificio(double consumoEnergia) {
	        this.consumoEnergia = consumoEnergia;
	    }
	    
	    public double obtenerConsumoEnergia() {
	        return consumoEnergia;
	    }
	    
	    public double obtenerImpactoEcologico() {
	        return consumoEnergia * 0.0028;
	    }
	}

	class Auto implements ImpactoEcologico {
	    private double emisionesCO2;
	    
	    public Auto(double emisionesCO2) {
	        this.emisionesCO2 = emisionesCO2;
	    }
	    
	    public double obtenerEmisionesCO2() {
	        return emisionesCO2;
	    }
	    
	    public double obtenerImpactoEcologico() {
	        return emisionesCO2 * 0.0089;
	    }
	}

	class Bicicleta implements ImpactoEcologico {
	    public double obtenerImpactoEcologico() {
	        return 0;
	    }
	}

