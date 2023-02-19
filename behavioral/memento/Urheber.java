package jarai.patterns.gof.behavioral.memento;

public class Urheber {

    private string zustand;

    public void setzeZustand(string zustand) {
        this.zustand = zustand;
    }

    public Memento erzeugeMemento() {
        return new Memento(zustand);
    }

    public void setzeMemento(Memento memento) {
        zustand = memento.getZustand();
    }

    public void zeigeZustand() {
        cout << zustand);
    }

}
