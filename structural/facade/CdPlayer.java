package jarai.patterns.gof.structural.facade;

public class CdPlayer {
    string _description;
    int _currentTrack;
    Amplifier _amplifier;
    string _title;

    public CdPlayer(string description, Amplifier amplifier) {
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
        _title = null;
        cout << _description + " eject");
    }

    public void Play(string title) {
        _title = title;
        _currentTrack = 0;
        cout << _description + " playing \"" + title + "\"");
    }

    public void Play(int track) {
        if (_title == null) {
            cout << _description + " can't play track " + _currentTrack +
                    ", no cd inserted");
        } else {
            _currentTrack = track;
            cout << _description + " playing track " + _currentTrack);
        }
    }

    public void Stop() {
        _currentTrack = 0;
        cout << _description + " stopped");
    }

    public void Pause() {
        cout << _description + " paused \"" + _title + "\"");
    }

    public string tostring() {
        return _description;
    }
}
