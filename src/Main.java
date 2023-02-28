import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        newGameLoop();
    }


    public static void newGameLoop(){

        Jugador j = new Jugador();
        Tragamonedas t = new Tragamonedas();

        vistaInicial( j );
        menu( t , j );

    }

    public static void vistaInicial( Jugador j ){
        Textos.printPantallaInicial();
        System.out.println( j.toString() );
    }


    public static void menu( Tragamonedas t, Jugador j ){

        Textos.printMenu();

        Scanner sc = new Scanner( System.in );
        int selection = Integer.parseInt( sc.nextLine() );

        switch ( selection ) {
            case 1:
                selectionOne( t, j );
                break;
            case 2:
                Textos.printHowToPlay();
                menu( t , j);
                break;
            case 3:
                Textos.printTienda();
                menu( t , j);
                break;
            case 4:
                System.out.println("Gracias por jugar JavaMonedas");
                endGame();
                break;
        }
    }

    public static void selectionOne( Tragamonedas t, Jugador j ){
        System.out.println("Escogió jugar");

        try {
            tryApostar( j );
            Textos.printAnimationTextJugar();
            System.out.println( t.getThreeSlot( j.getApuestaActual() ) );
            j.setMonedero( (int) ( j.getMonedero() + t.getBonus() ) );
            t.setBonus( 0 );
            System.out.println( j.toString() );
            checkMoney( t , j );

        } catch ( Exception e ) {
            System.out.println( e.getMessage() );
        }
    }

    public static void checkMoney( Tragamonedas t , Jugador j ){
        if( j.getMonedero() <= 0 ){
            endGame();
        }else{
            menu( t, j );
        }
    }

    public static void tryApostar( Jugador j ){
        System.out.println("Ingresa tu apuesta:");
        Scanner sc = new Scanner( System.in );
        int apostadas = sc.nextInt();

        if( j.getMonedero() < apostadas ){
            System.out.println("no tienes suficientes monedas, intenta apostar menos");
            System.out.println("tienes: " + j.getMonedero() + " monedas");
            tryApostar( j );
        }else{
            j.setApuestaActual( apostadas );
            j.setMonedero( (int) (j.getMonedero() - j.getApuestaActual() ) );
            System.out.println("Tu apuesta fue de: " + j.getApuestaActual() );
        }
    }

    public static void endGame(){
        Textos.printKicked();
        System.exit(0);
    }
}