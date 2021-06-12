import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);


        String operacion = " .";

        System.out.println("Hola, elige una operacion, sumar o restar");
        operacion =scan.nextLine();

        switch (operacion){

            case "sumar":
                Suma.sumar();
                break;

            case "restar":
                Resta.restar();
                break;
        }


    }

}

