public class Jugador {
    String head;
    String chest;
    String hands;
    String legs;
    String foot;

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


    @Override
    public String toString() {
        return "{ Tu Outfit actual es }\n" +
                "Cabeza  :" + head + '\n' +
                "Cuerpo  :" + chest + '\n' +
                "Manos   :" + hands + '\n' +
                "Piernas :" + legs + '\n' +
                "Pies    :" + foot + '\n';
    }
}
