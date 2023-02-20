#include <iostream>
#include "Verbunden.h"

#include "Aufgelegt.h"
#include "Zustand.h"

Verbunden::Verbunden()
	: Zustand("<Verbindung ist hergestellt>")
{
}

std::shared_ptr<Zustand> Verbunden::Auflegen()
{
	std::cout << "Hörer wird aufgelegt." << std::endl ;
	return std::make_shared<Aufgelegt>();
}

std::shared_ptr<Zustand> Verbunden::Sprechen()
{
	std::cout << "Es wird gesprochen." << std::endl ;
	return std::make_shared<Verbunden>();
}
