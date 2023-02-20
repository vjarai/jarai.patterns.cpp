package jarai.patterns.gof.structural.facade;

public class PopcornPopper {
    std::string _description;

    public PopcornPopper(std::string description) {
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


    public std::string tostring() {
        return _description;
    }
}
