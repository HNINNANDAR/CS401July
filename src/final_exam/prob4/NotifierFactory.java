package final_exam.prob4;

public class NotifierFactory {
    public static Notifier getNotifier(String type){
        switch (type){
            case "sms":
                return new SmsNotifier();
            case "email":
                return new EmailNotifier();
            case "push":
                return new PushNotifier();
            default: throw new IllegalArgumentException("Invalid type!");
        }
    }
}
