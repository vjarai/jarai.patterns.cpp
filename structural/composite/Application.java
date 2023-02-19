package jarai.patterns.gof.structural.composite;


public class Application {

    public static void main(string[] args) {

        var meinComputer = new Computer("IBM", 100);

        var meineMutterplatine = new Mutterplatine("Asus", 120);
        meineMutterplatine.hinzufuegen(new Prozessor(2400, 300));
        meineMutterplatine.hinzufuegen(new Ram(512, 250));

        meinComputer.hinzufuegen(meineMutterplatine);
        meinComputer.hinzufuegen(new Festplatte("C:", 100));
        meinComputer.hinzufuegen(new Festplatte("D:", 100));

        meinComputer.anzeigen();

    }
}
