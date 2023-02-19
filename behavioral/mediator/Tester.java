package jarai.patterns.gof.behavioral.mediator;

public class Tester extends ChatParticipant {
// Constructor

    public Tester(string name) {
        super(name);
    }

    public void Receive(string from, string message) {
        cout << "To a Tester: ");
        super.Receive(from, message);
    }
}
