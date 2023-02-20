package jarai.patterns.gof.behavioral.memento;


public class Memento {

    private  std::string zustand;

    Memento(std::string zustand) {
        this.zustand = zustand;
    }

    std::string getZustand() {
        return zustand;
    }

}
