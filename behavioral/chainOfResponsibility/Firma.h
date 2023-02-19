#pragma once

#include <iostream>
#include <string>
#include <vector>

#include "Mitarbeiter.h"

class Firma {

protected:
	std::vector<Mitarbeiter*> mitarbeiter;
	std::string name_;

public:
	Firma(std::string name)
		: name_(name) {
	}

	void einstellen(Mitarbeiter& bearbeiter) {
		mitarbeiter.push_back(&bearbeiter);
	}

	bool bearbeitenAnfrage(const std::string& anfrage) {

		for (const auto& bearbeiter : mitarbeiter) {
			if (bearbeiter->bearbeitenAnfrage(anfrage))
				return true;

			std::cout << bearbeiter->name_ + " kennt " + anfrage + " nicht." << std::endl ;
		}
		//	keiner hat es gewusst...
		std::cout << name_ + " kennt " + anfrage + " nicht." << std::endl ;
		return false;
	}
};
