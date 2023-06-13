package Archivos;

import java.util.Scanner;
import java.util.Stack;

public class sueldo {
    //hecho por Fernando Dante Rodriguez Silva

    //Use pila en la estructura
    public Stack<Integer> pila_sueldo = new Stack<Integer>();
    public static Scanner sc = new Scanner(System.in);
    public static int datos;


    public static void main(String[] args) {

        sueldo obj = new sueldo();
        obj.Datos(obj.pila_sueldo);
        
    }

    public void Datos(Stack<Integer> p){

        System.out.println("¿Cuantos datos desea ingresar?: ");
        datos = sc.nextInt();
        for (int i = 0; i < datos; i++){
            System.out.println("Ingresa el dato: " + (i+1) + ": ");
            p.push(sc.nextInt());
        }

        System.out.println("La lista es: " + p);

    }

    public static Stack<Integer>sueldos(Stack<Integer> p) {

        //for (int i = 0; )



        return p;
        
    }



}
