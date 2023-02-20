package jarai.patterns.gof.creational.abstractFactory;


public abstract class Hemd {

    protected  std::string bezeichnung;
    protected  int kragenweite;

    Hemd(std::string bezeichnung, int kragenweite) {
        this.bezeichnung = bezeichnung;
        this.kragenweite = kragenweite;
    }

    abstract void anzeigen();

}