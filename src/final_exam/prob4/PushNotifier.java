package final_exam.prob4;

public class PushNotifier implements Notifier{

    @Override
    public void sendNotification(String recipient, String message) {
        if(Notifier.isValidMessage(message))
            System.out.println("Push: " + sendFormattedNotification(recipient, message));
        else
            System.out.println("Invalid Push.");
    }
}
