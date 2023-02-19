#pragma once

#include <iostream>
#include <string>
#include <utility>
#include <vector>

#include "Mitarbeiter.h"

class Firma
{
protected:
	std::vector<Mitarbeiter*> mitarbeiter_;
	std::string name_;

public:
	explicit Firma(std::string name)
		: name_(std::move(name))
	{
	}

	void einstellen(Mitarbeiter& bearbeiter)
	{
		mitarbeiter_.push_back(&bearbeiter);
	}

	bool bearbeitenAnfrage(const std::string& anfrage) const
	{
		for (const auto& bearbeiter : mitarbeiter_)
		{
			if (bearbeiter->bearbeitenAnfrage(anfrage))
				return true;

			std::cout << bearbeiter->name_ + " kennt " + anfrage + " nicht." << std::endl;
		}
		//	keiner hat es gewusst...
		std::cout << name_ + " kennt " + anfrage + " nicht." << std::endl;
		return false;
	}
};
