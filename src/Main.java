import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tragamonedas tragamonedas = new Tragamonedas();
        Jugador j = new Jugador();

        boolean active = true;

        System.out.println("__--Bienvenido a JavaMonedas--__");
        System.out.println("Un juego de apuestas en el cual puedes mejorar tu Outfit");
        System.out.println( j.toString() );

        while ( active ){
            System.out.println("========================");
            System.out.println("¿Que harás ahora?");
            System.out.println("1. Jugar");
            System.out.println("2. ¿Cómo jugar?");
            System.out.println("3. Salir");

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

            }else if( selection  == 3 ){
                System.out.println("Gracias por jugar JavaMonedas");
                active = false;
            }else if( selection  == 2 ){
                System.out.println("El juego funciona con monedas\n"+
                        "las cuales debes apostar para obtener más.\n"+
                        "Con las monedas puedes mejorar tu Outfit,\n"+
                        "Así que puedes pasarte por la tienda, comprarlas y usarlas\n"+
                        "En fin, ahora tengo que contarte sobre como funciona la máquina:\n"+
                        "  >> Si obtienes 2 símbolos iguales = x2 \n"+
                        "  >> Si obtienes 3 símbolos iguales = x10");
            }

        }
    }
}