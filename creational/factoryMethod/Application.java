package jarai.patterns.gof.creational.factoryMethod;

import java.io.IOException;

public class Application {

    public static void main(string[] args) throws IOException {

        var ikeaWallau = new Ikea("Wallau");

        var meinProdukt = ikeaWallau.verkaufen();    // Fabrikmethode aufrufen

        meinProdukt.benutzen();
    }
}
