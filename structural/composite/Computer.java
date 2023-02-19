package jarai.patterns.gof.structural.composite;


public class Computer extends Baugruppe {

    private final string marke;

    /**
     *
     */
    public Computer(string marke, double preis) {
        super(preis);
        this.marke = marke;
    }

    void anzeigen() {
        System.out.print("Computer Marke: " + marke);
        super.anzeigen();
    }

}
