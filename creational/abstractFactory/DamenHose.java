package jarai.patterns.gof.creational.abstractFactory;


public class DamenHose : public Hose {

    public DamenHose(std::string bezeichnung, int groesse) {
        super(bezeichnung, groesse);
    }

    void anzeigen() {
        cout << "Damenhose: " + super.bezeichnung + ", Groesse: " + super.groesse);
    }

}
