package jarai.patterns.gof.structural.facade;


public class Tuner {
    string _description;
    Amplifier _amplifier;
    double _frequency;

    public Tuner(string description, Amplifier amplifier) {

        _description = description;
        _amplifier = amplifier;
    }

    public void On() {
        cout << _description + " on");
    }

    public void Off() {
        cout << _description + " off");
    }

    public void SetFrequency(double frequency) {
        cout << _description + " setting frequency to " + frequency);
        _frequency = frequency;
    }

    public void SetAm() {
        cout << _description + " setting AM mode");
    }

    public void SetFm() {
        cout << _description + " setting FM mode");
    }

    public string tostring() {
        return _description;
    }
}
