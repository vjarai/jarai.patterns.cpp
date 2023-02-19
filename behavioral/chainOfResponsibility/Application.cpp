
#include "Firma.h"
#include "Putzfrau.h"
#include "Buchhalter.h"
#include "Verkaeufer.h"

int main() {

	Firma meineFirma("ABC GmbH");

	Putzfrau putzfrau("Putzfrau Schulz");
	Verkaeufer verkaeufer("Verkaeufer Mueller");
	Buchhalter buchhalter("Buchhalter Meier");

	meineFirma.einstellen(putzfrau);
	meineFirma.einstellen(verkaeufer);
	meineFirma.einstellen(buchhalter);

	meineFirma.bearbeitenAnfrage("Kontostand");
	meineFirma.bearbeitenAnfrage("Preis");
	meineFirma.bearbeitenAnfrage("Sinn des lebens");
}
