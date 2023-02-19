#pragma once


class Buchhalter : public Mitarbeiter
{
public:
	explicit Buchhalter(const std::string& name)
		: Mitarbeiter(name)
	{
	}

	bool bearbeitenAnfrage(const std::string& anfrage) const override
	{
		if (anfrage == "Kontostand")
		{
			std::cout << name_ + " sagt: Kontostand ist 123.45" << std::endl;
			return true;
		}

		return false;
	}
};
