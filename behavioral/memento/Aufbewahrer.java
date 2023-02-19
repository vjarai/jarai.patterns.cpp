package jarai.patterns.gof.behavioral.memento;

import java.util.Vector;

public class Aufbewahrer {

    private final Vector<Memento> mementos = new Vector<>();

    private final Urheber urheber;

    Aufbewahrer(Urheber urheber) {
        this.urheber = urheber;
    }

    void speichereZustand() {
        mementos.add(urheber.erzeugeMemento());
    }

    void rueckgaengigZustand(int i) {
        urheber.setzeMemento(mementos.get(i));
    }

}
