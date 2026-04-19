public class messengerNotification implements NotificationStrategy{

    @Override
    public void sendNotification(User user, String message) {
        System.out.println("messenger messaege to:" + user.getName() + "message Body:- "+message);

    }
}
