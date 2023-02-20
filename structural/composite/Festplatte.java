package jarai.patterns.gof.structural.composite;


public class Festplatte : public Bauteil {

    private final string laufwerk;

    /**
     *
     */
    public Festplatte(string laufwerk, double preis) {
        super(preis);
        this.laufwerk = laufwerk;
    }

    void anzeigen() {
        System.out.print("Festplatte " + laufwerk);
        super.anzeigen();
    }

}