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
                tiendaMenu( j );
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

    public static void tiendaMenu( Jugador j ){
        Textos.printTienda();
        Scanner tsc = new Scanner(System.in);
        int selectionInShop = tsc.nextInt();

        switch( selectionInShop ){
            case 1:
                System.out.println("escogió cabeza");
                menuCabeza( j );
                break;
            default:
                tiendaMenu( j );
                break;
        }
    }

    public static void menuCabeza( Jugador j ){
        String[] things = {
                "1. Gorrito de papel............   100 monedas",
                "2. Gorro de vaquero............   500 monedas",
                "3. Gorro de psíquico...........  1000 monedas",
                "4. Cabeza de caballo plástica..  5000 monedas",
                "5. Gorro de oro ............... 10000 monedas"
        };

        for( int i = 0; i < 4; i++){
            System.out.println(things[i]);
        }

        Scanner sc = new Scanner(System.in);
        int clotheSelected = sc.nextInt();

        System.out.println("seleccionó " + clotheSelected );

        switch( clotheSelected ){
            case 1:
                tryBuy( 100 , j );
                break;
            case 2:
                tryBuy( 500 , j );
                break;
            case 3:
                tryBuy( 1000 , j );
                break;
            case 4:
                tryBuy( 5000 , j );
                break;
            case 5:
                tryBuy( 10000 , j );
                break;
        }

    }

    public static void tryBuy( int value, Jugador j ){

        switch( value ){
            case 100:
                if( j.getMonedero() > value ){
                    j.setHead("Gorrito de papel");
                    j.setMonedero((int) (j.getMonedero() - value));
                    System.out.println("Equipaste: " + j.getHead());
                }else{
                    System.out.println("no te alcanza");
                }
                break;
            case 500:
                if( j.getMonedero() > value ){
                    j.setHead("Gorrito de vaquero");
                    j.setMonedero((int) (j.getMonedero() - value));
                }else{
                    System.out.println("no te alcanza");
                }
                break;
            case 1000:
                if( j.getMonedero() > value ){
                    j.setHead("Gorrito de psíquico");
                    j.setMonedero((int) (j.getMonedero() - value));
                }else{
                    System.out.println("no te alcanza");
                }
                break;
            case 5000:
                if( j.getMonedero() > value ){
                    j.setHead("Cabeza de caballo plástica");
                    j.setMonedero((int) (j.getMonedero() - value));
                }else{
                    System.out.println("no te alcanza");
                }
                break;
            case 10000:
                if( j.getMonedero() > value ){
                    j.setHead("Gorro de oro");
                    j.setMonedero((int) (j.getMonedero() - value));
                }else{
                    System.out.println("no te alcanza");
                }
                break;
        }
    }

    public static void endGame(){
        Textos.printKicked();
        System.exit(0);
    }
}