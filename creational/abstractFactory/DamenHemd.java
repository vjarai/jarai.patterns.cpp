package jarai.patterns.gof.creational.abstractFactory;


public class DamenHemd : public Hemd {

    DamenHemd(string bezeichnung, int kragenweite) {
        super(bezeichnung, kragenweite);
    }

    void anzeigen() {
        cout << "Damenhemd: " + super.bezeichnung + ", Groesse: " + super.kragenweite);
    }

}
