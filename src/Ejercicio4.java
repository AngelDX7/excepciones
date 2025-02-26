import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int numerin_aleatroio = random.nextInt(100)+1;
        int [] array_aleatoria = new int[numerin_aleatroio];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <array_aleatoria.length; i++){
            array_aleatoria[i]= random.nextInt(10)+1;
        }
        boolean salir=true;
        while (salir){
            try {
                System.out.println("Introduce un la posicion que quieres mostrar");
                int numerin = sc.nextInt();
                if (numerin<0){
                    salir = false;
                }
                System.out.println(array_aleatoria[numerin]);
            }  catch (InputMismatchException e){
                System.out.println("Valor introducido incorrecto");
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException arar){
                System.out.println("La posicion introducida esta fuera del rango");
            }
        }


    }
}
