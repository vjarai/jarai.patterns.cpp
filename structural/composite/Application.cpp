#include "Computer.h"
#include "Mutterplatine.h"
#include "Prozessor.h"
#include "Ram.h"
#include "Festplatte.h"

int main() {

	Computer meinComputer("IBM", 100);
	Festplatte hd1("C:", 100);
	Festplatte hd2("D:", 100);

	Mutterplatine meineMutterplatine("Asus", 120);
	Prozessor prozessor = Prozessor(2400, 300);
	Ram ram = Ram(512, 250);
	meineMutterplatine.hinzufuegen( prozessor);
	meineMutterplatine.hinzufuegen( ram);

	meinComputer.hinzufuegen(meineMutterplatine);
	meinComputer.hinzufuegen(hd1);
	meinComputer.hinzufuegen(hd2 );

	meinComputer.anzeigen();

}

