package jarai.patterns.gof.creational.prototype;

public class KlonbarerInteger implements Klonbar {

    private int intWert;

    public KlonbarerInteger(int i) {
        this.intWert = i;
    }

    public Klonbar klone() {

        return new KlonbarerInteger(intWert);
    }

    public void anzeigen() {
        cout << intWert);
    }


    public void setIntWert(int intWert) {
        this.intWert = intWert;
    }

}
