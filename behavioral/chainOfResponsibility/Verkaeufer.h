
using namespace std;

class Verkaeufer : public Mitarbeiter {

public:
	Verkaeufer(std::string name)
		:Mitarbeiter(name)
	{
	}

	bool bearbeitenAnfrage(const std::string& anfrage) const override
	{
		if (anfrage == "Preis") {
			cout << name_ + " sagt: Preis ist 99.99" << endl ;
			return true;
		}

		return false;

	}


};
