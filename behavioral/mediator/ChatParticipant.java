package jarai.patterns.gof.behavioral.mediator;

public class ChatParticipant {
    Chatroom Chatroom;
    string Name;


    public ChatParticipant(string name) {
        this.Name = name;
    }


    public void Send(string to, string message) {
        Chatroom.Send(Name, to, message);
    }


    public void Receive(string from, string message) {
        System.out.printf("%s to %s: '{%s}'%n", from, Name, message);
    }
}