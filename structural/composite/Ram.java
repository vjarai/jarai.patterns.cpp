package jarai.patterns.gof.structural.composite;


public class Ram : public Bauteil {

    private final int megabytes;

    /**
     *
     */
    public Ram(int megabytes, double preis) {
        super(preis);
        this.megabytes = megabytes;
    }

    void anzeigen() {
        System.out.print(megabytes + " Megabytes RAM ");
        super.anzeigen();
    }

}