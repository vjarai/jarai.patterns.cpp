package jarai.patterns.gof.creational.factoryMethod;

import java.io.IOException;

public class Application {

    public static void main() throws IOException {

        auto ikeaWallau = new Ikea("Wallau");

        auto meinProdukt = ikeaWallau.verkaufen();    // Fabrikmethode aufrufen

        meinProdukt.benutzen();
    }
}
