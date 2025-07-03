package midterm.notification;

public class PushNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("Push Noti sent: " + message);
    }
}
