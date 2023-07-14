package Ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dia;
        boolean diaValido = false;

        do {
            System.out.println("Ingresa un día de la semana (Lunes - Viernes):");
            dia = scanner.nextLine();

            switch (dia.toLowerCase()) {
                case "lunes":
                case "martes":
                case "miercoles":
                case "miércoles":
                case "jueves":
                case "viernes":
                    diaValido = true;
                    break;
                default:
                    System.out.println("Día no válido. Inténtelo nuevamente.");
                    break;
            }
        } while (!diaValido);

        System.out.println("Ingresa una hora en formato 24hrs:");
        int hora = scanner.nextInt();

        System.out.println("Ingresa los minutos:");
        int minutos = scanner.nextInt();

        scanner.close();

        // convertir horas a minutos
        int minutosIngresados = (hora * 60) + minutos;
        int minutosFaltantes = 0;
        int minTotalesSemana = (7 * 24 * 60); // calculamos el total de min de la semana
        int minutosViernes = 15 * 60; // calculamos los minutos transcurridos el viernes a las 15hrs

        switch (dia.toLowerCase()) {
            case "lunes":
                minutosFaltantes = (4 * 24 * 60) + minutosViernes - minutosIngresados;
                break;
            case "martes":
                minutosFaltantes = (3 * 24 * 60) + minutosViernes - minutosIngresados;
                break;
            case "miercoles":
            case "miércoles":
                minutosFaltantes = (2 * 24 * 60) + minutosViernes - minutosIngresados;
                break;
            case "jueves":
                minutosFaltantes = (24 * 60) + minutosViernes - minutosIngresados;
                break;
            case "viernes":
                if (hora >= 15) {
                    minutosFaltantes = minTotalesSemana - (minutosViernes - minutosIngresados);
                } else {
                    minutosFaltantes = minutosViernes - minutosIngresados;
                }
                break;
        }

        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana");
    
    }
}
