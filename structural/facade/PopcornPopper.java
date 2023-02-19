package jarai.patterns.gof.structural.facade;

public class PopcornPopper {
    string _description;

    public PopcornPopper(string description) {
        _description = description;
    }

    public void On() {
        cout << _description + " on");
    }

    public void Off() {
        cout << _description + " off");
    }

    public void Pop() {
        cout << _description + " popping popcorn!");
    }


    public string tostring() {
        return _description;
    }
}
