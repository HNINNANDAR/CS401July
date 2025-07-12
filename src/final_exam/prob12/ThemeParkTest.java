package final_exam.prob12;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThemeParkTest {
    public static void main(String[] args) throws InterruptedException {
        Set<ChocolateDispenser> dispensers = ConcurrentHashMap.newKeySet();
        ExecutorService festivalWorkers = Executors.newFixedThreadPool(10);

        Runnable setupTask = () -> {
            ChocolateDispenser dispenser = ChocolateDispenser.getInstance();
            dispensers.add(dispenser);
        };

        // 10 festival workers all try to set up the dispenser at once!
        for (int i = 0; i < 10; i++) {
            festivalWorkers.submit(setupTask);
        }

        festivalWorkers.shutdown();
        festivalWorkers.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Unique ChocolateDispenser instances: " + dispensers.size());
        System.out.println("Number of times dispenser setup happened: " + ChocolateDispenser.getSetupCount());
        System.out.println("Did chaos happen (singleton broken)? " +
                (dispensers.size() > 1 || ChocolateDispenser.getSetupCount() > 1 ? "Yes!" : "No. System safe."));
    }

}
