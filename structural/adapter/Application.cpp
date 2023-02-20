

#include <iostream>

#include "Printer.h"
#include "PdfCreator.h"
#include "Report.h"
#include "PdfCreatorToPrinterAdapter.h"

int main() {

	Printer meinDrucker;
	PdfCreator meinPlotter ;
	PdfCreatorToPrinterAdapter adapter(meinPlotter);
	Report meinReport ;

	std::cout << "Drucke Report auf dem Drucker..." << std::endl;
	meinReport.druckeReport(meinDrucker);

	std::cout << "Drucke Report als PDF..." << std::endl;
	meinReport.druckeReport(adapter);

}


