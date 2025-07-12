package final_exam.prob11;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        MessageFormatter messageFormatter = new MessageFormatter() {
            @Override
            public String format(String recipient, String message) {
                return String.format("To %s: %s", recipient, message);
            }
        };
        String result = messageFormatter.format("Alice","Don't forget the meeting");

        BiFunction<String, String, String> biFunction = (recipient, message) -> {
            return String.format("To %s %s",recipient, message);
        };
        String result1 = biFunction.apply("Bob","Luch at 1 PM.");
        System.out.println(result);
        System.out.println(result1);
    }
}
