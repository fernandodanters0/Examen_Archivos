package Archivos;

import java.util.Scanner;

public class Potencia {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingresa un numero: ");
        int num = sc.nextInt();
        serie_cuadrado(num);
        System.out.println();

    }

    public static double serie_cuadrado(int n) {

        if (n == 0) {
            return 0;
        } else {
            System.out.println(n + "^2 " + "es: " + n * n);
            return Math.pow(n, 2) + serie_cuadrado(n - 1);
        }

    }

}
