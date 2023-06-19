package Ejercisios;

// Genera una cola/pila para N elementos (N dado por el usuario) y llenalo con numeros
// aleatorios (0 a 25).
// Indica la posición (o indice) de la primera y ultima aparición del dato X en la estructura,
// donde X a sido dado por el usuario. codigo en java
import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;
import java.util.Scanner;

public class Busqueda {
    public Queue<Integer> cola1 = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        Busqueda bqd = new Busqueda();
        Busqueda.Cola(new LinkedList<>());

    }

    public static Queue<Integer> Cola(Queue<Integer> c) {
        System.out.println("¿Cuantos elementos desea ingresar? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            c.add(rnd.nextInt(26));
        }
        for (int queue : c) {
            System.out.print(" " + queue);
        }
        System.out.println();

        System.out.println("Ingresa el numero a buscar: ");
        int num = sc.nextInt();

        int primeraPos = -1;
        int ultimaPos = -1;
        int i = 0;

        for (int number : c) {
            if (number == num) {
                if (primeraPos == -1) {
                    primeraPos = i;
                }
                ultimaPos = i;
            }
            i++;
        }

        // Imprimir resultados
        if (primeraPos == -1) {
            System.out.println("El número " + num + " no se encuentra en la cola/pila.");
        } else {
            System.out.println("La primera aparición del número " + num + " está en la posición " + primeraPos + ".");
            System.out.println("La última aparición del número " + num + " está en la posición " + ultimaPos + ".");
        }

        return c;

    }
}
