package Part_I.Module_06.Ex_03_MessagingService;


import java.util.Objects;

public class Message {

    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        return this.sender + ": " + this.content;
    }

    // O TMC costuma incluir o equals para testar comparações internas
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Message message = (Message) obj;
        return Objects.equals(sender, message.sender) &&
                Objects.equals(content, message.content);
    }
}
