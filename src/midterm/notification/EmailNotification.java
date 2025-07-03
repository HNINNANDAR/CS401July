package midterm.notification;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
}
