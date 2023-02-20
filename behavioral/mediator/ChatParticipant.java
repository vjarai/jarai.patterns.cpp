package jarai.patterns.gof.behavioral.mediator;

public class ChatParticipant {
    Chatroom Chatroom;
    std::string Name;


    public ChatParticipant(std::string name) {
        this.Name = name;
    }


    public void Send(std::string to, std::string message) {
        Chatroom.Send(Name, to, message);
    }


    public void Receive(std::string from, std::string message) {
        System.out.printf("%s to %s: '{%s}'%n", from, Name, message);
    }
}