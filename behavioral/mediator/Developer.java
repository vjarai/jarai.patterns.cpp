package jarai.patterns.gof.behavioral.mediator;

public class Developer : public ChatParticipant {

    public Developer(string name) {
        super(name);
    }

    public void Receive(string from, string message) {
        cout << "To a non-Tester: ");
        super.Receive(from, message);
    }
}
