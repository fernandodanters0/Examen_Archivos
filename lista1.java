package Archivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lista1 {

    //hecho por Fernando Dante Rodriguez Silva

    public static Scanner sc = new Scanner(System.in);
    public List<String> Lista = new ArrayList<>();

    public static void main(String[] args) {

        lista1 obj = new lista1();
        lista1.Datos(obj.Lista);

    }

    public static void Datos(List<String> list) {
        Scanner x = new Scanner(System.in);
        System.out.println("Ingresa los datos de la lista ");
        String entrada = "";
        while (!entrada.equals("salir")) {
            System.out.println("Ingrese un String (o escriba 'salir' para terminar): ");
            entrada = x.nextLine();
            if (!entrada.equals("salir")) {
                list.add(entrada);
            }
        }

        System.out.println("La Lista es: " + list);
       
        List <String> nuevalist = new ArrayList<>();

    }
}
