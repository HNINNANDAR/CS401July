package midterm.notification;

public class InAppNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("In app notification sent: " + message);
    }
}
