import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Bienvenido al comprovador de numeros (pulsa 0 para salir)");
        while (!salir){
            System.out.println("Que numero quieres comprovar?");
            int numero = sc.nextInt();
            if (numero == 0){
                salir = true;
            }
            if (numero<0){
                imprimePositivo(numero);
            } else {
                imprimeNegatico(numero);
            }
            try {
                System.out.println("Numero introducido:" + numero);
            }  catch (InputMismatchException e){
                System.out.println("Valor introducido incorrecto");
                System.out.println(e.getMessage());
            }
        }


    }
    public static void imprimePositivo(int p) throws Exception {
        if (p<0){
            throw new Exception("Error: El numero no es positivo");
        }
        System.out.println("El numero si es positivo");
    }
    public static void imprimeNegatico(int n) throws Exception {
        if (n>0){
            throw new Exception("Error: El numero no es negativo");
        }
        System.out.println("El numero si es negativo");
    }
}
