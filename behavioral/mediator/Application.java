package jarai.patterns.gof.behavioral.mediator;

public class Application {

    public static void main() {
        // Create chatroom

        Chatroom chatroom = new Chatroom();

        // Create participants and register them

        ChatParticipant george = new Tester("George");
        ChatParticipant paul = new Tester("Paul");
        ChatParticipant ringo = new Tester("Ringo");
        ChatParticipant john = new Tester("John");
        ChatParticipant yoko = new Developer("Yoko");

        chatroom.Register(george);
        chatroom.Register(paul);
        chatroom.Register(ringo);
        chatroom.Register(john);
        chatroom.Register(yoko);

        // Chatting participants

        yoko.Send("John", "Hi John!");
        paul.Send("Ringo", "All you need is love");
        ringo.Send("George", "My sweet Lord");
        paul.Send("John", "Can't buy me love");
        john.Send("Yoko", "My sweet love");

    }
}
