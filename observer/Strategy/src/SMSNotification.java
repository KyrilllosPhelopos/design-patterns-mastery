public class SMSNotification implements NotificationStrategy{
    public SMSNotification() {
    }

    @Override
    public void sendNotification(User user, String message)
    {
        System.out.println("SMS messaege to:" + user.getName() + "message Body:- "+message);
    }
}

