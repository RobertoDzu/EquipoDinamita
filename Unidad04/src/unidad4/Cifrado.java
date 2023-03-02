package unidad4;

import java.util.Scanner;

public class Cifrado {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número de cuatro dígitos: ");
        int numero = input.nextInt();

        // Cifrado del número
        int digito1 = (numero / 1000 + 7) % 10;
        int digito2 = ((numero / 100) % 10 + 7) % 10;
        int digito3 = ((numero / 10) % 10 + 7) % 10;
        int digito4 = (numero % 10 + 7) % 10;

        int cifrado = digito3 * 1000 + digito4 * 100 + digito1 * 10 + digito2;

        System.out.printf("El número cifrado es: %04d%n", cifrado);

        // Descifrado del número
        System.out.print("Ingrese un número de cuatro dígitos cifrado: ");
        int cifrado2 = input.nextInt();

        int descifrado_digito1 = (cifrado2 / 10) % 10;
        int descifrado_digito2 = cifrado2 % 10;
        int descifrado_digito3 = (cifrado2 / 1000) % 10;
        int descifrado_digito4 = (cifrado2 / 100) % 10;

        int descifrado = (descifrado_digito1 * 1000 + descifrado_digito2 * 100
                + descifrado_digito3 * 10 + descifrado_digito4) - 7;

        if (descifrado < 0) {
            descifrado += 10;
        }

        System.out.printf("El número descifrado es: %04d%n", descifrado);

        input.close();
    }
}
