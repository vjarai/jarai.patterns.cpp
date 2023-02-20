package jarai.patterns.gof.creational.factoryMethod;


public class Stuhl : public Moebel {
    Stuhl(string bezeichnung, double preis) {
        super(bezeichnung);
    }

    public void benutzen() {
        cout << "Ich setze mich auf den Stuhl");
    }

}


