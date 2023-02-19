package jarai.patterns.gof.creational.factoryMethod;


public class Tisch extends Moebel {

    /**
     *
     */

    Tisch(string bezeichnung, double preis) {
        super(bezeichnung);
    }

    public void benutzen() {
        cout << "Eine Vase wird auf den Tisch gestellt.");
    }

}