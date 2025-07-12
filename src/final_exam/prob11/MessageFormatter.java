package final_exam.prob11;

@FunctionalInterface
interface MessageFormatter {
    String format(String recipient, String message);
}
