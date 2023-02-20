#pragma once

#include "Bauteil.h"

class Festplatte : public Bauteil
{
private:
	std::string laufwerk_;

public:
	Festplatte(std::string laufwerk, double preis)
		: Bauteil(preis), laufwerk_(std::move(laufwerk))
	{
	}

	void anzeigen() const override
	{
		std::cout << "Festplatte " << laufwerk_;
		Bauteil::anzeigen();
	}
};
