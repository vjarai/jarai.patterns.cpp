package jarai.patterns.gof.behavioral.state.pattern;


public class Abgehoben extends Zustand {
    public Abgehoben() {
        super("<Hörer ist abgenommen>");
    }

    public Zustand Auflegen() {
        cout << "Hörer wird aufgelegt.");
        return new Aufgelegt();
    }

    public Zustand Waehlen() {
        cout << "Rufnummer wird gewählt.");
        return new Verbunden();
    }
}
