public class Jugador {
    String head;
    String chest;
    String hands;
    String legs;
    String foot;
    int monedero;
    int apuestaActual;

    public Jugador(){
        this.head = "...";
        this.chest = "Polera genérica";
        this.hands = "...";
        this.legs = "Pantalón Buzo";
        this.foot = "Chalas";
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getHands() {
        return hands;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
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
                "Cabeza  :" + this.head + '\n' +
                "Cuerpo  :" + this.chest + '\n' +
                "Manos   :" + this.hands + '\n' +
                "Piernas :" + this.legs + '\n' +
                "Pies    :" + this.foot + '\n';
    }
}
