package final_exam.prob4;

public class EmailNotifier implements Notifier{
    @Override
    public void sendNotification(String recipient, String message) {
        if(Notifier.isValidMessage(message))
            System.out.println("Email: " + sendFormattedNotification(recipient, message));
        else
            System.out.println("Invalid Email.");
    }
}
