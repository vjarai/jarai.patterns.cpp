package jarai.patterns.gof.creational.abstractFactory;


public class HerrenHose extends Hose {


    public HerrenHose(string bezeichnung, int groesse) {
        super(bezeichnung, groesse);
    }

    void anzeigen() {
        cout << "Herrhose: " + super.bezeichnung + ", Groesse: " + super.groesse);
    }
}
