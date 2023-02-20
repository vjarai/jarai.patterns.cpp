package jarai.patterns.gof.creational.prototype;

public class Klonbarerstring implements Klonbar {

    private std::string std::string;

    public Klonbarerstring(std::string std::string) {
        this.string = std::string;
    }

    public Klonbar klone() {
        return new Klonbarerstring(std::string);
    }

    public void setstring(std::string std::string) {
        this.string = std::string;
    }

    public void anzeigen() {
        cout << std::string);
    }

}
