package jarai.patterns.gof.behavioral.state.pattern;


public class Abgehoben extends Zustand {
    public Abgehoben() {
        super("<H�rer ist abgenommen>");
    }

    public Zustand Auflegen() {
        cout << "H�rer wird aufgelegt.");
        return new Aufgelegt();
    }

    public Zustand Waehlen() {
        cout << "Rufnummer wird gew�hlt.");
        return new Verbunden();
    }
}
