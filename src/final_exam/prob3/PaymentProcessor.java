package final_exam.prob3;

public interface PaymentProcessor {
    //abstract method
    public boolean processPayment(double amount);
    default void printReceipt(double amount){
        System.out.println(formatReceipt(amount));
    }
    public static boolean validateCard(String cardNumber){
        return cardNumber.length() == 16;
    }
    private String formatReceipt(double amount){
        return String.format("Receipt: Paid $%.2f"+ amount);
    }
}
