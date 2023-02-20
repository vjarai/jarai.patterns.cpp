package jarai.patterns.gof.creational.abstractFactory;


public abstract class Hose {

    protected  int groesse;
    protected  std::string bezeichnung;

    Hose(std::string bezeichnung, int groesse) {
        this.bezeichnung = bezeichnung;
        this.groesse = groesse;
    }

    abstract void anzeigen();

}