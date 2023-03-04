public class Jugador {
    String head;
    int monedero;
    int apuestaActual;

    public Jugador(){
        this.head = "...";
        this.monedero = 100;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(int monedero) {
        this.monedero = monedero;
    }

    public int getApuestaActual() {
        return apuestaActual;
    }

    public void setApuestaActual(int apuestaActual) {
        this.apuestaActual = apuestaActual;
    }

    @Override
    public String toString() {
        return "{ Monedas: " + this.monedero + "}\n"+
                "{ Tu Outfit actual es }\n" +
                "Cabeza  :" + this.head + '\n';
    }
}
