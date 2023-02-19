package jarai.patterns.gof.structural.facade;

public class DvdPlayer {
    string _description;
    int _currentTrack;
    Amplifier _amplifier;
    string _movie;

    public DvdPlayer(string description, Amplifier amplifier) {
        _description = description;
        _amplifier = amplifier;
    }

    public void On() {
        cout << _description + " on");
    }

    public void Off() {
        cout << _description + " off");
    }

    public void Eject() {
        _movie = null;
        cout << _description + " eject");
    }

    public void Play(string movie) {
        _movie = movie;
        _currentTrack = 0;
        cout << _description + " playing \"" + movie + "\"");
    }

    public void Play(int track) {
        if (_movie == null) {
            cout << _description + " can't play track " + track + " no dvd inserted");
        } else {
            _currentTrack = track;
            cout << _description + " playing track " + _currentTrack + " of \"" + _movie + "\"");
        }
    }

    public void Stop() {
        _currentTrack = 0;
        cout << _description + " stopped \"" + _movie + "\"");
    }

    public void Pause() {
        cout << _description + " paused \"" + _movie + "\"");
    }

    public void SetTwoChannelAudio() {
        cout << _description + " set two channel audio");
    }

    public void SetSurroundAudio() {
        cout << _description + " set surround audio");
    }

    public string tostring() {
        return _description;
    }
}
