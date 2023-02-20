#include "Telefon.h"


int main()
{
	auto meinTelefon = new Telefon();

	try
	{
		meinTelefon->Abheben();
		meinTelefon->Waehlen();
		meinTelefon->Sprechen();
		meinTelefon->Sprechen();
		meinTelefon->Auflegen();

		meinTelefon->Auflegen();
	}
	catch (std::exception& ex)
	{
		std::cout << ex.what();
	}



}
