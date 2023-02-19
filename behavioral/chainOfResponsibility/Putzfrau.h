#pragma once

class Putzfrau : public Mitarbeiter
{
public:
	explicit Putzfrau(const std::string& name)
		: Mitarbeiter(name)
	{
	}

	bool bearbeitenAnfrage(const std::string& anfrage) const override
	{
		if (anfrage == "Sinn des lebens")
		{
			std::cout << name_ + " sagt: Spass haben." << std::endl;
			return true;
		}

		return false;
	}
};
