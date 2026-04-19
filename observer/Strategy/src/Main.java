//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
User kyrilos = new User("kyrillos");
User Abanoub = new User("Abanoub");
    NotificationService notoficationThroughSMS = new NotificationService(new SMSNotification()) {
    notoficationThroughSMS.notifyUser(kyrilos , "hiiiiiiiiiiiii");
};
}
