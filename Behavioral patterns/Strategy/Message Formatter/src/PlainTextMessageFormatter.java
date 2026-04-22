public class PlainTextMessageFormatter implements MessageFormatter{
    @Override
    public void format(String message) {
        System.out.println("Formatting the following Plain-TXT message:" + message);
    }
}
