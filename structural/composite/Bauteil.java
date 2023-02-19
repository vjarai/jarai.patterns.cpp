package jarai.patterns.gof.structural.composite;


public class Bauteil {

    protected final double preis;

    /**
     *
     */
    public Bauteil(double preis) {
        this.preis = preis;
    }

    void anzeigen() {
        cout << " zum Preis von: " + preis + " EUR.");
    }

}
