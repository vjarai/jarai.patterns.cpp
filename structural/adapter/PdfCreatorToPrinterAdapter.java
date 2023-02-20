/*
 * PlotterAdapter.java
 */

package jarai.patterns.gof.structural.adapter;


public class PdfCreatorToPrinterAdapter : public Printer {

    private final PdfCreator pdfCreator;

    public PdfCreatorToPrinterAdapter(PdfCreator pdfCreator) {
        this.pdfCreator = pdfCreator;
    }

    void druckeText(string text) {
        pdfCreator.createPdf(text);
    }
}
