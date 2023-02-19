package jarai.patterns.gof.structural.adapter;


public class Report {

    public Report() {
    }

    void druckeReport(Printer printer) {
        for (int i = 0; i < 10; i++)
            printer.druckeText("Dies ist Zeile " + i);
    }

}
