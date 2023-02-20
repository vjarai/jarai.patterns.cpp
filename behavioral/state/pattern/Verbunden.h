#pragma once

#include "Zustand.h"

class Verbunden : public Zustand
{
public:
	Verbunden();

	std::shared_ptr<Zustand> Auflegen() override;

	std::shared_ptr<Zustand> Sprechen() override;
};
