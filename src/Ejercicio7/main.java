package Ejercicio7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        ArrayList<Gato> losmichis = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador<5){

                System.out.println("Bienvenido a la casa de adopcion.");
                System.out.println("Solo caben " + (5-contador) + " gatos mas aviso asi que ten cuidao");
                System.out.println("Dime el nombre de el gatito");
                String nombre = sc.nextLine();

                System.out.println("Dime la edad del gatito");
                int edad = sc.nextInt();
                sc.nextLine();
            try{
                losmichis.add(new Gato(nombre,edad));
                contador++;
                System.out.println("Gato agregado correctamente");
            } catch (Exception e) {
                System.out.println("Error al crear al gato" + e.getMessage());
            }
        }

    }
}
