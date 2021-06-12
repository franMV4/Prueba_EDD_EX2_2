import java.util.Scanner;

public class Suma {



    public static void sumar(){

        Scanner scan = new Scanner(System.in);

        int n1 = 0;
        int n2= 0;
        int resultado = 0;



        System.out.println("Introduce un numero");
        n1 =scan.nextInt();

        System.out.println("Introduce un numero");
        n2 =scan.nextInt();

        resultado = n1 + n2;

        System.out.println("El resultado es " + resultado);
    }
}
