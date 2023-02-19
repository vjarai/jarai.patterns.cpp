package jarai.patterns.gof.structural.facade;

public class Projector {
    string _description;
    DvdPlayer _dvdPlayer;

    public Projector(string description, DvdPlayer dvdPlayer) {
        _description = description;
        _dvdPlayer = dvdPlayer;
    }

    public void On() {
        cout << _description + " on");
    }

    public void Off() {
        cout << _description + " off");
    }

    public void WideScreenMode() {
        cout << _description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void TvMode() {
        cout << _description + " in tv mode (4x3 aspect ratio)");
    }

    public string tostring() {
        return _description;
    }
}
