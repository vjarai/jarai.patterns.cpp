package jarai.patterns.gof.structural.composite;


public class Prozessor extends Bauteil {

    private final int mhz;

    /**
     *
     */
    public Prozessor(int mhz, double preis) {
        super(preis);
        this.mhz = mhz;

    }

    void anzeigen() {
        System.out.print("Prozessor mit " + mhz + " Mhz ");
        super.anzeigen();
    }

}