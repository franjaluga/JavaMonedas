import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tragamonedas tragamonedas = new Tragamonedas();

        boolean active = true;

        System.out.println("__--Bienvenido a JavaMonedas--__");
        System.out.println("Tienes intentos ilimitados para lanzar la máquina tragamonedas");
        System.out.println("La idea es que tras jugar, te salgan tres símbolos iguales");

        while ( active ){
            System.out.println("========================");
            System.out.println("¿Que harás ahora?");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");

            Scanner sc = new Scanner( System.in );
            int selection = Integer.parseInt( sc.nextLine() );

            if(  selection == 1 ){
                System.out.println("Escogió jugar");
                try {
                    Thread.sleep(2000);
                    System.out.println("* pusiste una moneda *");
                    Thread.sleep(1000);
                    System.out.println("* cling *");
                    Thread.sleep(1000);
                    System.out.println("* ¡la máquina comienza a funcionar! *");
                    Thread.sleep(1000);
                    System.out.println("Tus resultados son:\n");
                    Thread.sleep(1000);
                    System.out.println( tragamonedas.getThreeSlot() );

                } catch (Exception e) {
                    System.out.println(e);
                }

            }else if( selection  == 2 ){
                System.out.println("Gracias por jugar JavaMonedas");
                active = false;
            }

        }
    }
}