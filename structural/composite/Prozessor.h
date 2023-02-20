#pragma once

class Prozessor : public Bauteil
{
	int mhz_;

public:
	Prozessor(int mhz, double preis)
		: Bauteil(preis), mhz_(mhz)
	{
	}

	void anzeigen() const override
	{
		std::cout << "Prozessor mit " + std::to_string(mhz_) + " Mhz ";
		Bauteil::anzeigen();
	}
};
