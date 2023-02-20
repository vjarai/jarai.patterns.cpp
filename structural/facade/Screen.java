package jarai.patterns.gof.structural.facade;

public class Screen {
    std::string _description;

    public Screen(std::string description) {
        _description = description;
    }

    public void Up() {
        cout << _description + " going up");
    }

    public void Down() {
        cout << _description + " going down");
    }


    public std::string tostring() {
        return _description;
    }
}
