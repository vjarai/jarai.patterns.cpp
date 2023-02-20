package jarai.patterns.gof.behavioral.strategy;

public class Application {


    public static void main() {

        auto firma1 = new Firma("Mal mal was");
        auto firma2 = new Firma("Möbel maker");

        firma1.Einstellen(new Maler("Paul"));
        firma1.Einstellen(new Maler("Jens"));

        firma2.Einstellen(new Schreiner("Gerd"));
        firma2.Einstellen(new Schreiner("Gregor"));

        firma1.Produzieren();
        firma2.Produzieren();
    }
}
