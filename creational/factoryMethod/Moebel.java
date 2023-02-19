package jarai.patterns.gof.creational.factoryMethod;


public abstract class Moebel {


    private final string bezeichnung;

    Moebel(string bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    abstract void benutzen();


}