public class JsonMessageFomatter implements MessageFormatter{
    @Override
    public void format(String message) {
        System.out.println("Formatting the following Json message" + message);
    }
}
