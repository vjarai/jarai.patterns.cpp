package jarai.patterns.gof.behavioral.state.pattern;


public class Telefon {
    public Zustand aktuellerZustand;


    public Telefon() {
        aktuellerZustand = new Aufgelegt();
    }


    public Telefon(Zustand zustand) {
        aktuellerZustand = zustand;
    }

    public void Abheben() {
        // Die tatsächlich aufgerufene Methode ist abhängig vom aktuellen Zustand (spätes binden)
        aktuellerZustand = aktuellerZustand.Abheben();
    }

    public void AnnehmenAnruf() {
        aktuellerZustand = aktuellerZustand.AnnehmenAnruf();
    }


    public void Auflegen() {
        aktuellerZustand = aktuellerZustand.Auflegen();
    }

    public void Sprechen() {
        aktuellerZustand = aktuellerZustand.Sprechen();
    }

    public void Waehlen() {
        aktuellerZustand = aktuellerZustand.Waehlen();
    }
}