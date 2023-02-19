package jarai.patterns.gof.creational.abstractFactory;


public class DamenHose extends Hose {

    public DamenHose(string bezeichnung, int groesse) {
        super(bezeichnung, groesse);
    }

    void anzeigen() {
        cout << "Damenhose: " + super.bezeichnung + ", Groesse: " + super.groesse);
    }

}
