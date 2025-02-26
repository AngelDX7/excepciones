import java.sql.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double [] numeros = new double [5];
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador<numeros.length){
        try {
            System.out.println("Introduce un numero:");
            double numeroin = sc.nextDouble();
            System.out.println("Numero introducido:" + numeroin);
            numeros [contador] = numeroin;
            contador++;
        }  catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
            System.out.println(e.getMessage());
        }
    }
    }

}
