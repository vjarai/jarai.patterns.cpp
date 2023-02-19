#pragma once

class Mitarbeiter {

public:

	std::string name_;

	Mitarbeiter(const std::string& name) {

		name_ = name;
	}

	virtual bool bearbeitenAnfrage(const std::string& anfrage) const
	{
		return false;
	}
};
