#pragma once

#include <memory>
#include <string>

class Zustand
{
public:
	std::string Bezeichnung;

	Zustand(std::string bezeichnung)
	{
		Bezeichnung = bezeichnung;
	}

	virtual std::shared_ptr<Zustand> Abheben()
	{
		throw std::exception("Sie können derzeit den Hörer nicht abheben.");
	}

	virtual std::shared_ptr<Zustand> AnnehmenAnruf()
	{
		throw std::exception("Sie können derzeit keinen Anruf annehmen.");
	}

	virtual std::shared_ptr<Zustand> Auflegen()
	{
		throw std::exception("Sie können derzeit den Hörer nicht auflegen.");
	}

	virtual std::shared_ptr<Zustand> Sprechen()
	{
		throw std::exception("Sie können derzeit nicht sprechen.");
	}


	std::string tostring()
	{
		return Bezeichnung;
	}

	virtual std::shared_ptr<Zustand> Waehlen()
	{
		throw std::exception("Sie können derzeit keine Nummer wählen.");
	}
};
