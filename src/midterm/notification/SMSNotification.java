package midterm.notification;

public class SMSNotification implements Notification
{
    @Override
    public void send(String message) {
        System.out.println("SMS sent: "+ message);
    }
}
