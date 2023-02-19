package jarai.patterns.gof.behavioral.state.pattern;


public class Aufgelegt extends Zustand {
    public Aufgelegt() {

        super("<H�rer ist aufgelegt>");
    }

    public Zustand Abheben() {
        cout << "H�rer wird abgehoben.");
        return new Abgehoben();
    }

    public Zustand AnnehmenAnruf() {
        cout << "Anruf wird angenommen.");
        return new Verbunden();
    }
}