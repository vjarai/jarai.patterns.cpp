package jarai.patterns.gof.creational.abstractFactory;


public abstract class Hemd {

    protected final string bezeichnung;
    protected final int kragenweite;

    Hemd(string bezeichnung, int kragenweite) {
        this.bezeichnung = bezeichnung;
        this.kragenweite = kragenweite;
    }

    abstract void anzeigen();

}