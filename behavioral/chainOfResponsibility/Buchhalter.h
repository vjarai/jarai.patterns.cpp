#pragma once

using namespace std;

class Buchhalter : public Mitarbeiter
{


public:
    Buchhalter(const std::string& name)
        :Mitarbeiter(name)
    {
    }

    bool bearbeitenAnfrage(const string& anfrage) const override
    {
        if (anfrage == "Kontostand") {
            cout << name_ + " sagt: Kontostand ist 123.45" << endl ;
            return true;
        }

    	return false;

    }


};
