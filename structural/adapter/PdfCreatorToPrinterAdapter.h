#pragma once


class PdfCreatorToPrinterAdapter : public Printer {

private:
    PdfCreator pdfCreator;

public:
    PdfCreatorToPrinterAdapter(PdfCreator pdfCreator)
	    : pdfCreator(pdfCreator)
	{
    }

    void druckeText(std::string text) override
	{
        pdfCreator.createPdf(text);
    }
};
