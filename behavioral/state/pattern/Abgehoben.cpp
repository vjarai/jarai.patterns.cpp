#include <iostream>

#include "Abgehoben.h"
#include "Aufgelegt.h"
#include "Verbunden.h"

Abgehoben::Abgehoben()
	: Zustand("<H�rer ist abgenommen>")
{
}

std::shared_ptr<Zustand> Abgehoben::Auflegen()
{
	std::cout << "H�rer wird aufgelegt." << std::endl ;
	return std::make_shared<Aufgelegt>();
}

std::shared_ptr<Zustand> Abgehoben::Waehlen()
{
	std::cout << "Rufnummer wird gew�hlt." << std::endl ;
	return std::make_shared<Verbunden>();
}
