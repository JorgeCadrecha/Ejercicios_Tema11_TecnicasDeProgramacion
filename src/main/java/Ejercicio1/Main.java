package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreCompleto1 = "Andreas Dulac";
        String nombreCompleto2 = "paul walker";
        String nombreCompleto3 = "";

        String iniciales1 = ClaseCadena.devuelveIniciales(nombreCompleto1);
        String iniciales2 = ClaseCadena.devuelveIniciales(nombreCompleto2);
        String iniciales3 = ClaseCadena.devuelveIniciales(nombreCompleto3);

        System.out.println("Iniciales de " + nombreCompleto1 + ": " + iniciales1);
        System.out.println("Iniciales de " + nombreCompleto2 + ": " + iniciales2);
        System.out.println("Iniciales de " + nombreCompleto3 + ": " + iniciales3);

        // Comprobacion de que cualquier nombre puede ser introducido por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre completo: ");
        String nombreUsuario1 = teclado.nextLine();
        String inicialesUsuario1 = ClaseCadena.devuelveIniciales(nombreUsuario1);
        System.out.println("Iniciales de " + nombreUsuario1 + ": " + inicialesUsuario1);
    }
}
