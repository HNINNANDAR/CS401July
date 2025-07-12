package final_exam.prob4;

public class SmsNotifier implements Notifier{
    @Override
    public void sendNotification(String recipient, String message) {
        if(Notifier.isValidMessage(message))
            System.out.println("SMS: " + sendFormattedNotification(recipient, message));
        else
            System.out.println("Invalid SMS.");
    }
}
