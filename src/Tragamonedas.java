public class Tragamonedas {

    boolean active;
    String slot1;
    String slot2;
    String slot3;
    int bonus;

    double random1;
    double random2;
    double random3;

    Tragamonedas(){
        this.slot1 = "";
        this.slot2 = "";
        this.slot3 = "";
        this.active = true;
    }

    public String getSlot1(){
        return slot1;
    }

    public String getSlot2(){
        return slot2;
    }

    public String getSlot3(){
        return slot3;
    }

    public void setSlot1(String s1){
        this.slot1 = s1;
    }

    public void setSlot2(String s2) {
        this.slot2 = slot2;
    }

    public void setSlot3(String s3) {
        this.slot3 = s3;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getNewRandom0to4(){

        double r = Math.random();

        r *= 5;

        return Math.floor(r);

    }

    public String getOneSlot(){

        Double d = this.getNewRandom0to4();

        return this.convertingSlot( d );
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String convertingSlot(Double d){
        String e = null;

        if(d == 0){
            e = "   /   ";
        }

        if(d == 1){
            e = "   &   ";
        }

        if(d == 2){
            e = "   #   ";
        }

        if(d == 3){
            e = "   7   ";
        }

        if(d == 4){
            e = "   X   ";
        }

        return e;
    }

    public String getThreeSlot( int apuesta){

        String s1 = this.getOneSlot();
        String s2 = this.getOneSlot();
        String s3 = this.getOneSlot();

        String texto = "[" + s1 + "]" +  "[" + s2 + "]" + "[" + s3 + "]";

        if( s1 == s2 && s2 == s3 ){
            this.setBonus( apuesta * 10 );
            System.out.println("***********************");
            System.out.println("Felicidades, ganaste: " + this.getBonus());
            System.out.println("***********************");
        }else{
            if(s1 == s2 || s1 == s3 || s2 == s3){
                this.setBonus( apuesta * 2 );
                System.out.println("-----> Atinaste a 2, ganaste: " + this.getBonus() );
            }
        }


        return texto;
    }





}
