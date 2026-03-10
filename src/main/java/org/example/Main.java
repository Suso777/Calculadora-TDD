package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA TDD ===");

        while (true) {
            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Introduce el primer número: ");
            double a = scanner.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double b = scanner.nextDouble();

            switch (opcion) {
                case 1 -> System.out.println("Resultado: " + calc.sumar(a, b));
                case 2 -> System.out.println("Resultado: " + calc.restar(a, b));
                case 3 -> System.out.println("Resultado: " + calc.multiplicar(a, b));
                case 4 -> {
                    try {
                        System.out.println("Resultado: " + calc.dividir(a, b));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                default -> System.out.println("Opción no válida");
            }
        }
    }
}