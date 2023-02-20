package jarai.patterns.gof.creational.factoryMethod;


public abstract class Moebel {


    private  std::string bezeichnung;

    Moebel(std::string bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    abstract void benutzen();


}