package jarai.patterns.gof.behavioral.memento;

public class Urheber {

    private std::string zustand;

    public void setzeZustand(std::string zustand) {
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
