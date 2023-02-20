#pragma once
#include <iomanip>

class Bauteil
{
protected:
	double preis;

public:
	Bauteil(double preis)
		: preis(preis)
	{
	}

	virtual void anzeigen() const
	{
		std::cout << " zum Preis von: "
			<< std::setprecision(2) << std::fixed << preis
			<< " EUR." << std::endl;
	}
};
