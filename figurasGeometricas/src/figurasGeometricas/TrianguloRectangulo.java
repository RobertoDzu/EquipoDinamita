package figurasGeometricas;

public class TrianguloRectangulo {
 public TrianguloRectangulo(double lado1, double lado2, double lado3) {
 super(lado1, lado2, lado3);
 }
 public TrianguloRectangulo (double cateto1,double cateto2) {
	 double hipotenusa = Math.sqrt(cateto1*cateto1+cateto2*cateto2);
	 this.establecer(cateto1,cateto2, hipotenusa);
 }
 public TrianguloRectangulo (double hipotenusa, int angulo) {
 	double catOp=hipotenusa * Math.sin(angulo);
 	double catAd=hipotenusa * Math.cos(angulo);
 	this.establecer(hipotenusa, catOp, catAd);
 }
}
