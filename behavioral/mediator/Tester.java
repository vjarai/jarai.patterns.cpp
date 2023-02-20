package jarai.patterns.gof.behavioral.mediator;

public class Tester : public ChatParticipant {
// Constructor

    public Tester(std::string name) {
        super(name);
    }

    public void Receive(std::string from, std::string message) {
        cout << "To a Tester: ");
        super.Receive(from, message);
    }
}
