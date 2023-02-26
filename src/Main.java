import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gameloop();
    }

    public static void gameloop(){
        Jugador j = new Jugador();
        Textos.printPantallaInicial();
        menu(j);
    }

    public static void menu(Jugador j){

        System.out.println( j.toString() );
        Tragamonedas tragamonedas = new Tragamonedas();

        while ( tragamonedas.isActive() ){
            loop( tragamonedas );
        }

    }

    public static void loop( Tragamonedas tragamonedas ){

        Textos.printMenu();

        Scanner sc = new Scanner( System.in );
        int selection = Integer.parseInt( sc.nextLine() );

        if(  selection == 1 ){
            selectionOne( tragamonedas );

        }else if( selection  == 4 ){
            System.out.println("Gracias por jugar JavaMonedas");
            tragamonedas.setActive(false);

        }else if( selection  == 2 ){
            Textos.printHowToPlay();

        }else if( selection == 3 ){
            Textos.printTienda();
        }
    }

    public static void selectionOne( Tragamonedas tragamonedas ){
        System.out.println("Escogió jugar");
        try {
            Textos.printAnimationTextJugar();
            System.out.println( tragamonedas.getThreeSlot() );

        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
    }


}