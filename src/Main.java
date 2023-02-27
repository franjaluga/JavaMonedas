import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gameLoop();
    }

    public static void gameLoop(){
        Jugador j = new Jugador();
        Tragamonedas tragamonedas = new Tragamonedas();

        j.setMonedero( 100 );
        Textos.printPantallaInicial();

        if( j.monedero >= 0 ){
            menu(j);
            apostar(j);
            hasEnoughtMoney( tragamonedas, j );

        }else{
            endGame();
        }
    }

    public static void menu( Jugador j ){
        System.out.println( j.toString() );
    }

    public static void apostar( Jugador j){
        System.out.println("Ingresa tu apuesta:");
        Scanner sc = new Scanner( System.in );
        j.setApuestaActual( sc.nextInt() );
        System.out.println("Tu apuesta fue de: " + j.getApuestaActual() );
    }


    public static void hasEnoughtMoney( Tragamonedas tragamonedas, Jugador j ){
        if( j.getApuestaActual() <= j.getMonedero() ){
            while ( tragamonedas.isActive() ){
                loop( tragamonedas, j );
            }
        }else{
            System.out.println("No te alcanza para apostar más");
            endGame();
        }
    }


    public static void loop( Tragamonedas tragamonedas, Jugador j ){

        Textos.printMenu();

        Scanner sc = new Scanner( System.in );
        int selection = Integer.parseInt( sc.nextLine() );

        if(  selection == 1 ){
            selectionOne( tragamonedas, j );

        }else if( selection  == 4 ){
            System.out.println("Gracias por jugar JavaMonedas");
            tragamonedas.setActive(false);

        }else if( selection  == 2 ){
            Textos.printHowToPlay();

        }else if( selection == 3 ){
            Textos.printTienda();
        }
    }

    public static void selectionOne( Tragamonedas tragamonedas, Jugador j ){
        System.out.println("Escogió jugar");

        try {
            j.setMonedero( (int) ( j.getMonedero() - j.getApuestaActual() ) );
            Textos.printAnimationTextJugar();
            System.out.println( tragamonedas.getThreeSlot( j.getApuestaActual() ) );
            j.setMonedero( (int) ( j.getMonedero() + tragamonedas.getBonus() ) );
            tragamonedas.setBonus( 0 );
            System.out.println( j.toString() );

        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
    }

    public static void endGame(){
        Textos.printKicked();
        System.exit(0);
    }
}