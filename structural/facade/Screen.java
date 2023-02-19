package jarai.patterns.gof.structural.facade;

public class Screen {
    string _description;

    public Screen(string description) {
        _description = description;
    }

    public void Up() {
        cout << _description + " going up");
    }

    public void Down() {
        cout << _description + " going down");
    }


    public string tostring() {
        return _description;
    }
}
