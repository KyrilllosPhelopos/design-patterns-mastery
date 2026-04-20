public class SlackStartegy implements NotificationStrategy{
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Slack messaege to:" + user.getName() + "message Body:- "+message);

    }
}
