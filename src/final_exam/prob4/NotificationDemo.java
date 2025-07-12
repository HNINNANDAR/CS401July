package final_exam.prob4;
public class NotificationDemo {
    public static void main(String[] args) {
        // Using the factory to get each type of Notifier
        Notifier smsNotifier = NotifierFactory.getNotifier("sms");
        Notifier emailNotifier = NotifierFactory.getNotifier("email");
        Notifier pushNotifier = NotifierFactory.getNotifier("push");


        // Send SMS notification
        smsNotifier.sendNotification("+1234567890", "Your appointment is confirmed.");


        // Send Email notification
        emailNotifier.sendNotification("user@example.com", "You have a new test result available.");


        // Send Push notification
        pushNotifier.sendNotification("user_device_token", "Don't forget to take your medicine!");


        // Using default method: notifySelf
        emailNotifier.notifySelf("System maintenance scheduled for tonight.");


        // Using default method: sendFormattedNotification
        pushNotifier.sendFormattedNotification("admin", "Critical update required.");
    }
}


