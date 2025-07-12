package final_exam.prob4;

public interface Notifier {
    void sendNotification(String recipient, String message);
    default void notifySelf(String message){
        sendNotification("self@system.com", message);
    }
    static boolean isValidMessage(String message){
        return message != null && message.length() < 160;
    }
    private String formatMessage(String recipient, String message){
        return String.format("To [%s]: [%s]",recipient,message);
        //"To ["+ recipient +"]: ["+message+"]";

    }
    default String sendFormattedNotification(String recipient, String message){
        return formatMessage(recipient,message);
    }
}
