package Actividades;
	import java.util.Random;

	public class Dados {
	    public static void main(String[] args) {
	        // Creamos un objeto de la clase Random para generar números aleatorios
	        Random random = new Random();

	        // Creamos un arreglo de enteros para registrar el número de veces que aparece cada posible suma
	        int[] sumas = new int[11];

	        // Iteramos 36,000,000 veces para simular el tiro de dos dados
	        for (int i = 0; i < 36000000; i++) {
	            // Generamos un número aleatorio entre 1 y 6 para el primer dado
	            int dado1 = random.nextInt(6) + 1;

	            // Generamos un número aleatorio entre 1 y 6 para el segundo dado
	            int dado2 = random.nextInt(6) + 1;

	            // Calculamos la suma de los dos valores
	            int suma = dado1 + dado2;

	            // Incrementamos el contador correspondiente al valor de la suma en el arreglo sumas
	            sumas[suma - 2]++;
	        }

	        // Imprimimos los resultados en formato tabular
	        System.out.printf("%s%10s%10s%n",  "Suma|",  "Frecuencia|" ,  "Porcentaje");

	        for (int i = 0; i < sumas.length; i++) {
	            int suma = i + 2;
	            int frecuencia = sumas[i];
	            double porcentaje = (double) frecuencia / 360000 * 100;

	            System.out.printf("%4d%10d%10.2f%%%n", suma, frecuencia, porcentaje);
	        }
	    }
	}


