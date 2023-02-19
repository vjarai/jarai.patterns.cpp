package jarai.patterns.gof.structural.facade;

public class Amplifier {
    string _description;
    Tuner _tuner;
    DvdPlayer _dvd;
    CdPlayer _cd;

    public Amplifier(string description) {
        _description = description;
    }

    public void On() {
        cout << _description + " on");
    }

    public void Off() {
        cout << _description + " off");
    }

    public void SetStereoSound() {
        cout << _description + " stereo mode on");
    }

    public void SetSurroundSound() {
        cout << _description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void SetVolume(int level) {
        cout << _description + " setting volume to " + level);
    }

    public void SetTuner(Tuner tuner) {
        cout << _description + " setting tuner to " + _dvd);
        _tuner = tuner;
    }

    public void SetDvd(DvdPlayer dvd) {
        cout << _description + " setting DVD player to " + dvd);
        _dvd = dvd;
    }

    public void SetCd(CdPlayer cd) {
        cout << _description + " setting CD player to " + cd);
        _cd = cd;
    }

    public string tostring() {
        return _description;
    }
}
