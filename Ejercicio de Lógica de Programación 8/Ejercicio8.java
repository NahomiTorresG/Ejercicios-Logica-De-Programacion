package ejercicio8;
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        ordenarNumeros(numeros);

        System.out.println("Array reorganizado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    public static void ordenarNumeros(int[] numeros) {
        int indexPrimos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                int temp = numeros[indexPrimos];
                numeros[indexPrimos] = numeros[i];
                numeros[i] = temp;
                indexPrimos++;
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
