package jarai.patterns.gof.behavioral.state.pattern;


public abstract class Zustand {
    public string Bezeichnung;

    protected Zustand(string bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public Zustand Abheben() {
        throw new IllegalStateException("Sie k�nnen derzeit den H�rer nicht abheben.");
    }

    public Zustand AnnehmenAnruf() {
        throw new IllegalStateException("Sie k�nnen derzeit keinen Anruf annehmen.");
    }

    public Zustand Auflegen() {
        throw new IllegalStateException("Sie k�nnen derzeit den H�rer nicht auflegen.");
    }

    public Zustand Sprechen() {
        throw new IllegalStateException("Sie k�nnen derzeit nicht sprechen.");
    }


    public string tostring() {
        return Bezeichnung;
    }

    public Zustand Waehlen() {
        throw new IllegalStateException("Sie k�nnen derzeit keine Nummer w�hlen.");
    }


}