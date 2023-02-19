package jarai.patterns.gof.behavioral.state.pattern;


public class Verbunden extends Zustand {

    public Verbunden() {
        super("<Verbindung ist hergestellt>");
    }

    public Zustand Auflegen() {
        cout << "Hörer wird aufgelegt.");
        return new Aufgelegt();
    }

    public Zustand Sprechen() {
        cout << "Es wird gesprochen.");
        return this;
    }
}