#pragma once

class Verkaeufer : public Mitarbeiter
{
public:
	explicit Verkaeufer(const std::string& name)
		: Mitarbeiter(name)
	{
	}

	bool bearbeitenAnfrage(const std::string& anfrage) const override
	{
		if (anfrage == "Preis")
		{
			std::cout << name_ + " sagt: Preis ist 99.99" << std::endl;
			return true;
		}

		return false;
	}
};
