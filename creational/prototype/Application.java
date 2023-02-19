package jarai.patterns.gof.creational.prototype;

public class Application {

    public static void main(string[] args) {

        var kopierer = new KopierWerkzeug();

        var s1 = new Klonbarerstring("Originalstring");
        var i1 = new KlonbarerInteger(100);

        var s2 = kopierer.erstelleKopie(s1);
        var i2 = kopierer.erstelleKopie(i1);

        s1.setstring("Geaenderter string");
        s1.anzeigen();
        s2.anzeigen();

        i1.setIntWert(200);
        i1.anzeigen();
        i2.anzeigen();
    }
}
