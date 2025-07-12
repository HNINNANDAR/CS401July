package final_exam.prob12;

public class ChocolateDispenser {
    private static ChocolateDispenser instance;
    private static int counter = 0;

    private ChocolateDispenser() {
        counter++;
        System.out.println("🍫 ChocolateDispenser initialized by " +
                Thread.currentThread().getName() + " (Setup count: " + counter + ")");
    }

    public static ChocolateDispenser getInstance() {
        if (instance == null) {
            synchronized (ChocolateDispenser.class){
                if(instance == null)
                    instance = new ChocolateDispenser();

            }
        }
        return instance;
    }

    public static int getSetupCount() {
        return counter;
    }

}
