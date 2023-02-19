package jarai.patterns.gof.behavioral.templateMethod;


public class Application {

    public static void main(string[] args) {

        Anwendung anwendung;

        // Die Anwendung als Consolenanwendung starten
        anwendung = new ConsolenAnwendung();
        anwendung.schablonenMethode();

        // Die gleiche Anwendung als Guianwendung starten
        anwendung = new GuiAnwendung();
        anwendung.schablonenMethode();
    }
}
