#pragma once

#include <iostream>
#include "Abgehoben.h"
#include "Verbunden.h"

class Aufgelegt : public Zustand
{
public:
	Aufgelegt();
	std::shared_ptr<Zustand> Abheben() override;
	std::shared_ptr<Zustand> AnnehmenAnruf() override;
};
