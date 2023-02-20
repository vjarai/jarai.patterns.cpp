#include <iostream>

#include "Aufgelegt.h"
#include "Verbunden.h"

Aufgelegt::Aufgelegt()
	: Zustand("<H�rer ist aufgelegt>")
{
}

std::shared_ptr<Zustand> Aufgelegt::Abheben()
{
	std::cout << "H�rer wird abgehoben." << std::endl ;
	return std::make_shared<Abgehoben>();
}

std::shared_ptr<Zustand> Aufgelegt::AnnehmenAnruf()
{
	std::cout << "Anruf wird angenommen." << std::endl ;
	return std::make_shared<Verbunden>();
}
