package jarai.patterns.gof.creational.abstractFactory;


public class Application {

    public static void main(string[] args) {

        var auswahl = 0;
        Kleiderfabrik meineKleiderfabrik;

        // Konkrete Fabrik kann zur LAUFZEIT ausgewaehlt werden:
        if (auswahl == 1)
            meineKleiderfabrik = new HerrenKleiderfabrik();
        else
            meineKleiderfabrik = new DamenKleiderfabrik();

        // Konkretefabrik erstellt Instanzen von Hemd/Hose ABGELEITETER Klassen
        var meinHemd = meineKleiderfabrik.erzeugeHemd();
        var meineHose = meineKleiderfabrik.erzeugeHose();

        meinHemd.anzeigen();
        meineHose.anzeigen();
    }
}
