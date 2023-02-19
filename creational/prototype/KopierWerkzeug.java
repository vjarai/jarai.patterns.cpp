package jarai.patterns.gof.creational.prototype;


public class KopierWerkzeug {

    Klonbar erstelleKopie(Klonbar prototyp) {
        return prototyp.klone();
    }

}
