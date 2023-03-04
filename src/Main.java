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
                tiendaMenu();
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

    public static void tiendaMenu(){
        Textos.printTienda();
        Scanner tsc = new Scanner(System.in);
        int selectionInShop = tsc.nextInt();

        switch( selectionInShop ){
            case 1:
                System.out.println("escogió cabeza");
                menuCabeza();
                break;
            case 2:
                System.out.println("escogió cuerpo");
                menuCuerpo();
                break;
            case 3:
                System.out.println("escogió manos");
                menuManos();
                break;
            case 4:
                System.out.println("escogió piernas");
                menuPiernas();
                break;
            case 5:
                System.out.println("escogió pies");
                menuPies();
                break;
            default:
                tiendaMenu();
                break;
        }
    }

    public static void menuCabeza(){
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

    }

    public static void menuCuerpo(){
        String[] things = {
                "1. Camisa Hawaiana.............   150 monedas",
                "2. Polera de perrito...........   450 monedas",
                "3. Camisa estampada............   990 monedas",
                "4. Abrigo de pieles............  5000 monedas",
                "5. Chaqueta de oro............. 25000 monedas"
        };

        for( int i = 0; i < 4; i++){
            System.out.println(things[i]);
        }

        Scanner sc = new Scanner(System.in);
        int clotheSelected = sc.nextInt();

        System.out.println("seleccionó " + clotheSelected );
    }

    public static void menuManos(){
        String[] things = {
                "1. Anillo de cobre.............  110 monedas",
                "2. Reloj con manecillas de pez.  120 monedas",
                "3. Guantes blancos.............  200 monedas",
                "4. Cigarro a medio fumar.......  500 monedas",
                "5. Guantes de oro.............. 1000 monedas"
        };

        for( int i = 0; i < 4; i++){
            System.out.println(things[i]);
        }

        Scanner sc = new Scanner(System.in);
        int clotheSelected = sc.nextInt();

        System.out.println("seleccionó " + clotheSelected );
    }

    public static void menuPiernas(){
        String[] things = {
                "1. Pantalón de cuero...........    500 monedas",
                "2. Shorts de mezclilla.........    600 monedas",
                "3. Falda pantalón..............    700 monedas",
                "4. Bermudas de plumas..........   5000 monedas",
                "5. Tanga de oro................  10000 monedas"
        };

        for( int i = 0; i < 4; i++){
            System.out.println(things[i]);
        }

        Scanner sc = new Scanner(System.in);
        int clotheSelected = sc.nextInt();

        System.out.println("seleccionó " + clotheSelected );
    }

    public static void menuPies(){
        String[] things = {
                "1. Zapatos negros..............    200 monedas",
                "2. Chalas de goma..............    300 monedas",
                "3. Botas de cuero..............    560 monedas",
                "4. Tacones brillantes..........   2000 monedas",
                "5. Plataformas de oro..........  30000 monedas"
        };

        for( int i = 0; i < 4; i++){
            System.out.println(things[i]);
        }

        Scanner sc = new Scanner(System.in);
        int clotheSelected = sc.nextInt();

        System.out.println("seleccionó " + clotheSelected );
    }

    public static void endGame(){
        Textos.printKicked();
        System.exit(0);
    }
}