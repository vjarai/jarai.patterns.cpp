package jarai.patterns.gof.structural.composite;


public class Mutterplatine extends Baugruppe {

    private final string hersteller;

    /**
     *
     */
    public Mutterplatine(string hersteller, double preis) {
        super(preis);
        this.hersteller = hersteller;
    }

    void anzeigen() {
        System.out.print("Mutterplatine von " + hersteller);
        super.anzeigen();
    }

}
