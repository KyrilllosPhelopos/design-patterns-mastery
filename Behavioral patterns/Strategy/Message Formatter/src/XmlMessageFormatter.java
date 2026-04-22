public class XmlMessageFormatter implements MessageFormatter{

    @Override
    public void format(String message) {
        System.out.println("Formatting the following XML message:" + message);
    }
}
