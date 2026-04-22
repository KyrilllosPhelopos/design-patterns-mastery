public class EmailNotification implements NotificationStrategy{
    public void sendNotification(User user, String message)
    {
        System.out.println("Email messaege to:" + user.getName() + "message Body:- "+message);
    }
}
