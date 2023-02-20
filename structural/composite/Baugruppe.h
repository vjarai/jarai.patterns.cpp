#pragma once

#include <vector>

#include "Bauteil.h"

class Baugruppe : public Bauteil
{
protected:
	std::vector<const Bauteil*> bauteile;

public:
	Baugruppe(double preis)
		: Bauteil(preis)
	{
	}

	void anzeigen() const override
	{
		Bauteil::anzeigen();

		for (const auto bauteil : bauteile)
		{
			bauteil->anzeigen();
		}
	}

	void hinzufuegen(const Bauteil& bauteil)
	{
		bauteile.push_back(&bauteil);
	}
};
