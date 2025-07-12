package lesson11.Labs.prob12;

import java.util.Optional;

public class MySingletonLazy {
    public static MySingletonLazy instance = null;

    public MySingletonLazy() {
    }

    public static MySingletonLazy getInstance(){
        instance = Optional.ofNullable(instance)
                .orElseGet(() -> new MySingletonLazy());
        return instance;
    }

    @Override
    public String toString() {
        return "My Singleton Lazy...";
    }

    public static void main(String[] args) {
        MySingletonLazy mySingletonLazy = MySingletonLazy.getInstance();
        System.out.println(mySingletonLazy);
    }
}
