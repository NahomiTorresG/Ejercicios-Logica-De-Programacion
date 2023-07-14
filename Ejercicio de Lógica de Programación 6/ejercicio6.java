package Ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra o frase:");
		String tuFrase = input.nextLine();
		
		System.out.println("-------------");
		
		System.out.println("Texto original: " + tuFrase);
		
		StringBuilder reverseString = new StringBuilder();
		reverseString.append(tuFrase);
		
		System.out.println("-------------");
		
		reverseString.reverse();
		
		String tuResultado = reverseString.toString();
		
		System.out.println("Texto invertido: " + tuResultado);
		input.close();
		
	}

}
