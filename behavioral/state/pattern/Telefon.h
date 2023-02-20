#pragma once
#include "Zustand.h"
#include "Aufgelegt.h"

class Telefon
{
public:
	std::shared_ptr<Zustand> aktuellerZustand;


	Telefon()
	{
		aktuellerZustand = std::make_shared<Aufgelegt>();
	}


	Telefon(std::shared_ptr<Zustand> zustand)
	{
		aktuellerZustand = zustand;
	}

	void Abheben()
	{
		// Die tats�chlich aufgerufene Methode ist abh�ngig vom aktuellen Zustand (sp�tes binden)
		aktuellerZustand = aktuellerZustand->Abheben();
	}

	void AnnehmenAnruf()
	{
		aktuellerZustand = aktuellerZustand->AnnehmenAnruf();
	}


	void Auflegen()
	{
		aktuellerZustand = aktuellerZustand->Auflegen();
	}

	void Sprechen()
	{
		aktuellerZustand = aktuellerZustand->Sprechen();
	}

	void Waehlen()
	{
		aktuellerZustand = aktuellerZustand->Waehlen();
	}
};
