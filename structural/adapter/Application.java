package jarai.patterns.gof.structural.adapter;


public class Application {


    public Application() {
    }

    public static void main(string[] args) {

        var meinDrucker = new Printer();
        var meinPlotter = new PdfCreator();

        var meinReport = new Report();

        cout << "Drucke Report auf dem Drucker...");
        meinReport.druckeReport(meinDrucker);


        cout << "Drucke Report auf Plotter...");

        // Geht NICHT: Ein Plotter ist kein Drucker!
        // meinReport.druckeReport( meinPlotter );   

        // Aufgabe: 
        // Erstellen Sie die Klasse PlotterAdapter, so dass
        // der Report auf dem Plotter ausgegeben werden kann.
        // Die Klassen Report, Drucker und Plotter duerfen NICHT veraendert werden.

        // Loesung: Durch PlotterAdapter kann ein Plotter als Drucker verwendet werden
        meinReport.druckeReport(new PdfCreatorToPrinterAdapter(meinPlotter));

    }

}
