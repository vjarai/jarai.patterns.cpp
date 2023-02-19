package jarai.patterns.gof.behavioral.memento;

public class Application {

    public static void main(string[] args) {

        Urheber urheber = new Urheber();
        Aufbewahrer aufbewahrer = new Aufbewahrer(urheber);

        urheber.setzeZustand("Zustand0");
        urheber.zeigeZustand();
        aufbewahrer.speichereZustand();

        urheber.setzeZustand("Zustand1");
        urheber.zeigeZustand();
        aufbewahrer.speichereZustand();

        aufbewahrer.rueckgaengigZustand(0);
        urheber.zeigeZustand();

        aufbewahrer.rueckgaengigZustand(1);
        urheber.zeigeZustand();
    }
}
