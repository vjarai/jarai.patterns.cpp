package jarai.patterns.gof.creational.abstractFactory;


public abstract class Hose {

    protected final int groesse;
    protected final string bezeichnung;

    Hose(string bezeichnung, int groesse) {
        this.bezeichnung = bezeichnung;
        this.groesse = groesse;
    }

    abstract void anzeigen();

}