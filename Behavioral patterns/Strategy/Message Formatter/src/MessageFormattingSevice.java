public class MessageFormattingSevice {

    public MessageFormatter messageFormatter ;

    public MessageFormattingSevice(MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    public void messageFormat(String message)
    {
        this.messageFormatter.format(message);
    }
}
