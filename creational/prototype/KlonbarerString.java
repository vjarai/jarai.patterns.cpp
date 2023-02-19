package jarai.patterns.gof.creational.prototype;

public class Klonbarerstring implements Klonbar {

    private string string;

    public Klonbarerstring(string string) {
        this.string = string;
    }

    public Klonbar klone() {
        return new Klonbarerstring(string);
    }

    public void setstring(string string) {
        this.string = string;
    }

    public void anzeigen() {
        cout << string);
    }

}
