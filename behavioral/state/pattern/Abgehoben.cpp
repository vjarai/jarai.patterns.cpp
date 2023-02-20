#include <iostream>

#include "Abgehoben.h"
#include "Aufgelegt.h"
#include "Verbunden.h"

Abgehoben::Abgehoben()
	: Zustand("<Hörer ist abgenommen>")
{
}

std::shared_ptr<Zustand> Abgehoben::Auflegen()
{
	std::cout << "Hörer wird aufgelegt." << std::endl ;
	return std::make_shared<Aufgelegt>();
}

std::shared_ptr<Zustand> Abgehoben::Waehlen()
{
	std::cout << "Rufnummer wird gewählt." << std::endl ;
	return std::make_shared<Verbunden>();
}
