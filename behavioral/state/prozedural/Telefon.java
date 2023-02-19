package jarai.patterns.gof.behavioral.state.prozedural;


public class Telefon {
    private TelefonZustand _aktuellerZustand = TelefonZustand.Aufgelegt;


    public Telefon() {

    }

    public Telefon(TelefonZustand aktuellerZustand) {
        _aktuellerZustand = aktuellerZustand;
    }


    public void Abheben() {
        if (_aktuellerZustand == TelefonZustand.Aufgelegt) {
            _aktuellerZustand = TelefonZustand.Abgehoben;
        } else {
            throw new IllegalStateException();
        }
    }

    public void AnnehmenAnruf() {
        if (_aktuellerZustand == TelefonZustand.Aufgelegt) {
            _aktuellerZustand = TelefonZustand.Verbunden;
        } else {
            throw new IllegalStateException();
        }
    }


    public void Auflegen() {
        switch (_aktuellerZustand) {
            case Verbunden:
            case Abgehoben:
                _aktuellerZustand = TelefonZustand.Aufgelegt;
                break;
            default:
                throw new IllegalStateException();
        }
    }

    public void Sprechen() {
        if (_aktuellerZustand != TelefonZustand.Verbunden) {
            throw new IllegalStateException();
        }
    }

    public void Waehlen() {
        if (_aktuellerZustand == TelefonZustand.Abgehoben) {
            _aktuellerZustand = TelefonZustand.Verbunden;
        } else {
            throw new IllegalStateException();
        }
    }
}
