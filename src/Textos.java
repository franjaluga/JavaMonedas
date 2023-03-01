public class Textos {

    public static void printPantallaInicial(){
        System.out.println("__-- Bienvenido a JavaMonedas --__");
        System.out.println("Un juego de apuestas en el que puedes ganar o perderlo todo");
    }

    public static void printMenu(){
        System.out.println("========================");
        System.out.println("¿Que harás ahora?");
        System.out.println("1. Jugar");
        System.out.println("2. ¿Cómo jugar?");
        System.out.println("3. Ir a la tienda");
        System.out.println("4. Salir");
    }

    public static void printAnimationTextJugar() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("* pusiste una moneda *");
        Thread.sleep(1000);
        System.out.println("* cling *");
        Thread.sleep(1000);
        System.out.println("* ¡la máquina comienza a funcionar! *");
        Thread.sleep(1000);
        System.out.println("Tus resultados son:\n");
        Thread.sleep(1000);
    }

    public static void printHowToPlay(){
        System.out.println("El juego funciona con monedas\n"+
                "las cuales debes apostar para obtener más.\n"+
                "Con las monedas puedes mejorar tu Outfit,\n"+
                "Así que puedes pasarte por la tienda, comprarlas y usarlas\n"+
                "En fin, ahora tengo que contarte sobre como funciona la máquina:\n"+
                "  >> Si obtienes 2 símbolos iguales = x2 \n"+
                "  >> Si obtienes 3 símbolos iguales = x10");
    }

    public static void printTienda(){
        System.out.println("Bienvenido a la tienda, ¿Que tipo de prenda buscas?: ");
        String[] things = {"1. Cabeza","2. Cuerpo","3. Manos","4. Piernas","5. Pies"};

        for( int i = 0; i < 4; i++){
            System.out.println(things[i]);
        }

        System.out.println("Ups!, de momento no te podemos vender nada, vuelve más tarde");
    }

    public static void printKicked(){
        System.out.println("Te hecharon a patadas de la máquina");
    }
}
