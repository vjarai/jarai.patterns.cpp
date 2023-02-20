#pragma once

#include "Verbunden.h"

class Abgehoben : public Zustand
{
public:
	Abgehoben();

	std::shared_ptr<Zustand> Auflegen() override;

	std::shared_ptr<Zustand> Waehlen() override;
};
