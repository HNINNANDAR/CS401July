package midterm.notification.ext;

import midterm.notification.*;

public class Main {
    public static void main(String[] args) {
        Notification noti = NotificationFactory.createNotification("sms");
        Notification noti1 = NotificationFactory.createNotification("push");
        Notification noti2 = NotificationFactory.createNotification("email");
        Notification noti3 = NotificationFactory.createNotification("sms");
        Notification noti4 = NotificationFactory.createNotification("inApp");

        noti1.send("HII");
        noti2.send("Hey");
        noti3.send("HELLO");
        noti.send("Hey there");
        noti4.send("OHH oh");
    }
}
