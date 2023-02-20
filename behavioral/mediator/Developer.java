package jarai.patterns.gof.behavioral.mediator;

public class Developer : public ChatParticipant {

    public Developer(std::string name) {
        super(name);
    }

    public void Receive(std::string from, std::string message) {
        cout << "To a non-Tester: ");
        super.Receive(from, message);
    }
}
