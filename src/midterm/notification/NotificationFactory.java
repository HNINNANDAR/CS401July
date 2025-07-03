package midterm.notification;

public class NotificationFactory {
    public static Notification createNotification(String type){
        Notification notification;
        switch(type){
            case "sms": return new SMSNotification();
            case "push": return new PushNotification();
            case "email": return new EmailNotification();
            case "inApp": return new InAppNotification();
            default: throw new IllegalArgumentException("Invalid type!");
        }

    }
}
