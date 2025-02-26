import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero:");
            int numeroin = sc.nextInt();
            System.out.println("Introduce un segundo numero:");
            int numeroin2 = sc.nextInt();
            int resultado = numeroin/numeroin2;
        }  catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
            System.out.println(e.getMessage());
        } catch (ArithmeticException a){
            System.out.println("No puedes dividir por cero");
        }

    }
}
