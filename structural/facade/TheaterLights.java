package jarai.patterns.gof.structural.facade;

public class TheaterLights {
    string _description;

    public TheaterLights(string description) {
        _description = description;
    }

    public void On() {
        cout << _description + " on");
    }

    public void Off() {
        cout << _description + " off");
    }

    public void Dim(int level) {
        cout << _description + " dimming to " + level + "%");
    }

    public string tostring() {
        return _description;
    }
}
