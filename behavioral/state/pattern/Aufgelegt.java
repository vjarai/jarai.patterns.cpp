package jarai.patterns.gof.behavioral.state.pattern;


public class Aufgelegt extends Zustand {
    public Aufgelegt() {

        super("<Hörer ist aufgelegt>");
    }

    public Zustand Abheben() {
        cout << "Hörer wird abgehoben.");
        return new Abgehoben();
    }

    public Zustand AnnehmenAnruf() {
        cout << "Anruf wird angenommen.");
        return new Verbunden();
    }
}