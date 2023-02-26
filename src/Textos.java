public class Textos {

    public static void printPantallaInicial(){
        System.out.println("__-- Bienvenido a JavaMonedas --__");
        System.out.println("Un juego de apuestas en el cual puedes mejorar tu Outfit");
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
        Thread.sleep(2000);
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
        System.out.println("De momento estamos trabajando en ello");
        System.out.println("Puedes jugar en la máquina pero aún no comprar nada");
        System.out.println("Outfit Fruna......   400 monedas");
        System.out.println("Outfit del Líder..   600 monedas");
        System.out.println("Outfit del Mall...   800 monedas");
        System.out.println("Outfit de Sastre..  1000 monedas");
        System.out.println("Outfit de Oro.....  5000 monedas");
    }

}
