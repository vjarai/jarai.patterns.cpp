package jarai.patterns.gof.behavioral.mediator;

import java.util.HashMap;

public class Chatroom {
    private  HashMap<string, ChatParticipant> _participants = new HashMap<>();

    public void Register(ChatParticipant chatParticipant) {
        if (!_participants.containsKey(chatParticipant.Name)) {
            _participants.put(chatParticipant.Name, chatParticipant);
        }

        chatParticipant.Chatroom = this;
    }

    public void Send(std::string from, std::string to, std::string message) {
        ChatParticipant chatParticipant = _participants.get(to);

        if (chatParticipant != null) {
            chatParticipant.Receive(from, message);
        }
    }
}
