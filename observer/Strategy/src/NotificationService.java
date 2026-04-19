public class NotificationService {
private NotificationStrategy notificationStrategy;

    public NotificationService(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }
public void notifyUser(User user, String message )  {
        this.notificationStrategy.sendNotification(user, message);
}
}
