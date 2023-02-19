package jarai.patterns.gof.behavioral.state.pattern;


public abstract class Zustand {
    public string Bezeichnung;

    protected Zustand(string bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public Zustand Abheben() {
        throw new IllegalStateException("Sie können derzeit den Hörer nicht abheben.");
    }

    public Zustand AnnehmenAnruf() {
        throw new IllegalStateException("Sie können derzeit keinen Anruf annehmen.");
    }

    public Zustand Auflegen() {
        throw new IllegalStateException("Sie können derzeit den Hörer nicht auflegen.");
    }

    public Zustand Sprechen() {
        throw new IllegalStateException("Sie können derzeit nicht sprechen.");
    }


    public string tostring() {
        return Bezeichnung;
    }

    public Zustand Waehlen() {
        throw new IllegalStateException("Sie können derzeit keine Nummer wählen.");
    }


}