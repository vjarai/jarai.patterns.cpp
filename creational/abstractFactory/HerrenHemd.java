package jarai.patterns.gof.creational.abstractFactory;


public class HerrenHemd extends Hemd {

    HerrenHemd(string bezeichnung, int kragenweite) {
        super(bezeichnung, kragenweite);
    }

    void anzeigen() {
        cout << "Herrenhose: " + super.bezeichnung + ", Groesse: " + super.kragenweite);
    }


}
