package jarai.patterns.gof.creational.prototype;

public class Application {

    public static void main() {

        auto kopierer = new KopierWerkzeug();

        auto s1 = new Klonbarerstring("Originalstring");
        auto i1 = new KlonbarerInteger(100);

        auto s2 = kopierer.erstelleKopie(s1);
        auto i2 = kopierer.erstelleKopie(i1);

        s1.setstring("Geaenderter string");
        s1.anzeigen();
        s2.anzeigen();

        i1.setIntWert(200);
        i1.anzeigen();
        i2.anzeigen();
    }
}
