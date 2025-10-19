package com.uttec.Calculadora;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double a, b, resultado = 0;

        do {
            System.out.println("=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            while (!sc.hasNextInt()) {
                System.out.println("Error: debes ingresar un número entre 1 y 5.");
                sc.next();
                System.out.print("Elige una opción: ");
            }
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                a = leerNumero(sc);

                System.out.print("Ingresa el segundo número: ");
                b = leerNumero(sc);

                try {
                    switch (opcion) {
                        case 1:
                            resultado = sumar(a, b);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 2:
                            resultado = restar(a, b);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 3:
                            resultado = multiplicar(a, b);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 4:
                            resultado = dividir(a, b);
                            System.out.println("Resultado: " + resultado);
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (opcion != 5) {
                System.out.println("Opción inválida, intenta de nuevo.");
            }

            System.out.println();

        } while (opcion != 5);

        System.out.println("Programa finalizado.");
        sc.close();
    }

    // ---- Operaciones con validaciones ----
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    // ---- Validación de entrada numérica ----
    public static double leerNumero(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Error: debes ingresar un número válido.");
            sc.next();
            System.out.print("Ingresa nuevamente: ");
        }
        return sc.nextDouble();
    }
}
