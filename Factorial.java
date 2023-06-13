package Archivos;

import java.util.Scanner;
//hecho por Fernando Dante Rodriguez Silva

public class Factorial {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa el numero a calcular su factorial: ");
        int num = sc.nextInt();
        long factor = factorial(num); // Recusrsion
        System.out.println("El factorial de: " + num + " es: " + factor);

    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
