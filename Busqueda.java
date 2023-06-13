package Archivos;

import java.util.Scanner;
import java.util.Queue;
import java.util.Random;
import java.util.*;

public class Busqueda {

    public static Scanner sc = new Scanner(System.in);
    // Stack<Integer> pila = new Stack<>();
    public static Queue<Integer> cola = new LinkedList<>();
    public static Random rand = new Random();

    public static void main(String[] args) {

        System.out.print("Ingrese el valor de N: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int num = rand.nextInt(26);
            cola.add(num);
            // pila.push(num);
        }

        System.out.println("La cola/pila generada es: " + cola);

        System.out.print("Ingrese el valor de X: ");
        int X = sc.nextInt();
        sc.close();

        int primeraAparicion = -1;
        int ultimaAparicion = -1;
        int i = 0;
        for (int num : cola) {
            if (num == X) {
                if (primeraAparicion == -1) {
                    primeraAparicion = i;
                }
                ultimaAparicion = i;
            }
            i++;
        }

        System.out.println("La primera aparición de " + X + " es en la posición " + primeraAparicion);
        System.out.println("La última aparición de " + X + " es en la posición " + ultimaAparicion);
    }

}
