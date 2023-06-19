package Ejercisios;
//Pide una serie de palabras al usuario, almacenarlas en una LISTA hasta que ingrese la

//palabra “FIN”, posteriormente imprimir todas las palabras en orden alfabetico de A-Z y de
//Z-A.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lista_palabras {

    public static Scanner sc = new Scanner(System.in);
    public List<String> lista1 = new ArrayList<>();

    public static void main(String[] args) {

        Lista_palabras obj1 = new Lista_palabras();
        Lista_palabras.lista(obj1.lista1);

    }

    public static void lista(List<String> list) {

        System.out.println("Ingrese las palabras o escriba (Fin) para salir.");
        do {
            String palabra = sc.nextLine();
            if (palabra.equals("Fin")){
                break;
            }
            list.add(palabra);

        } while (true);

        //Ordenamiento ascendente

        for (int i = 0; i < list.size() - 1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    String aux = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,aux);
                }
            }
        }

        System.out.println("\nLas palabras ordenadas de A-Z, son: ");
        for (String lista: list){
            System.out.println(lista);
        }

        //Ordenamiento descendente

        for (int i = 0; i < list.size() - 1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) < 0){
                    String aux = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,aux);
                }
            }
        }
        System.out.println("\nLas palabras ordenadas de Z-A, son: ");
        for (String lista: list){
            System.out.println(lista);
        }

    }
}