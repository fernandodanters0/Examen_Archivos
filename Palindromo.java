package Ejercisios;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {

    public Stack<Character> pila = new Stack<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce una frase: ");
        String word = sc.nextLine();
        if (esPalindromo(new Stack<>(), word)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

    }

    public static boolean esPalindromo(Stack<Character> p, String palabra) {

        for (int i = 0; i < palabra.length(); i++) {
            p.push(palabra.charAt(i));
        }
        String invertida = "";
        while (!p.isEmpty()) {
            invertida += p.pop();
        }

        return palabra.equalsIgnoreCase(invertida);

    }

}
