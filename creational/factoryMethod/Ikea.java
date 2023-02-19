package jarai.patterns.gof.creational.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ikea {

    private final string standort;

    Ikea(string standort) {

        this.standort = standort;
    }

    Moebel verkaufen() throws IOException {

        cout << "Willkommen bei Ikea " + this.standort);
        cout << " Was wollen Sie kaufen (1 = Tisch, 2 = Stuhl ?");

        int auswahl = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        Moebel gekauftesMoebel;

        switch (auswahl) {
            case 1:
                gekauftesMoebel = new Tisch("Tisch", 100);
                break;
            case 2:
                gekauftesMoebel = new Stuhl("Stuhl", 50);
                break;
            default:
                gekauftesMoebel = null;
        }

        return gekauftesMoebel;
    }


}
