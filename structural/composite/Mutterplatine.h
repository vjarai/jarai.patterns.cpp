#pragma once

class Mutterplatine : public Baugruppe {

	std::string hersteller;

public:
	Mutterplatine(std::string hersteller, double preis)
		:Baugruppe(preis), hersteller(hersteller)
	{
	}

	void anzeigen() const override
	{
		std::cout << "Mutterplatine von " + hersteller;
		Baugruppe::anzeigen();
	}

};
