package jarai.patterns.gof.creational.abstractFactory;


public class DamenKleiderfabrik : public Kleiderfabrik {

    Hemd erzeugeHemd() {

        return new DamenHemd("Bluse", 38);
    }

    Hose erzeugeHose() {
        return new DamenHose("Rock", 38);
    }

}
