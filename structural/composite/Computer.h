#pragma once

#include <iostream>
#include <string>

#include "Baugruppe.h"

class Computer : public Baugruppe
{
private:
	std::string marke;

public:
	Computer(std::string marke, double preis)
		: Baugruppe(preis), marke(marke)
	{
	}

	void anzeigen()
	{
		std::cout << "Computer Marke: " + marke;
		Baugruppe::anzeigen();
	}
};
