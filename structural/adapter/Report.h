#pragma once
#include <string>

class Report {

public:
	Report() {
	}

	void druckeReport(Printer& printer)
	{
		for (int i = 0; i < 10; i++)
			printer.druckeText(std::string("Dies ist Zeile ") + std::to_string(i));
	}

};
