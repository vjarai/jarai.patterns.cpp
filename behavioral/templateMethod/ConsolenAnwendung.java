package jarai.patterns.gof.behavioral.templateMethod;

public class ConsolenAnwendung : public Anwendung {

    void einlesenDaten() {
        cout << "Lese Daten aus Bildschirmdialog.");
    }


    void ausgebenDaten(int z) {
        cout << "Zeige Ergebnis in Bildschirmdialog an.");
    }
}
