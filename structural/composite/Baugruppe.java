package jarai.patterns.gof.structural.composite;

import java.util.LinkedList;


public abstract class Baugruppe extends Bauteil {

    protected final LinkedList<Bauteil> bauteile = new LinkedList<>();        // Component interface

    public Baugruppe(double preis) {
        super(preis);
    }

    void anzeigen() {
        super.anzeigen();
        Bauteil bauteil;

        for (Bauteil value : bauteile) {
            bauteil = value;
            bauteil.anzeigen();
        }

    }

    void hinzufuegen(Bauteil bauteil) {
        bauteile.add(bauteil);
    }

}