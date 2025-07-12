package lesson11.InClassExercise.optional_examples;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //1. how to create an empty optional obj (optional obj is empty)
        Optional<String> optionalString = Optional.empty();
        //use case scenario
        //use this optional.empty when the requied data cannot find from db
        System.out.println(optionalString);
        //check if empty or not first, to use get()
//        System.out.println(optionalString.get()); //will get an err because the obj is empty
        //check whether is empty or not
        System.out.println("Empty: " + optionalString.isEmpty());
        System.out.println("Present: " + optionalString.isPresent());
        optionalString.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Accept");
            }
        });

        //2. create a non-empty optional obj
        Optional<List<User>> optionalUser = Optional.of(
                List.of(
                new User("John"),
                new User("Tonny"))); //user obj is now in optional obj
        System.out.println("Optional User is empty? " + optionalUser.isEmpty());
        System.out.println("Optional User is present? " + optionalUser.isPresent());
        System.out.println("GET: " + optionalUser.get());
        optionalUser.ifPresent(System.out::println);
        //OR
        if (optionalUser.isPresent()) {
            System.out.println(optionalUser.get());
        }

        //3. Optional + Null
        String s = optionalString.orElse(getName()); //eagerly executed
        System.out.println(s);

        List<User> myUser = optionalUser.orElse(getNewName());
        //it still call the getNewName even though optionalUser is present
        //but not return

        //lazy execution
        List<User> myUser1 = optionalUser.orElseGet(Main::getNewName); //() -> getNewName() //no input + return something
        //orElseGet will call only when the obj is empty

    }
    static String getName(){
        System.out.println("get name is called.");
        return "guest";
    }
    static List<User> getNewName(){
        System.out.println("get new name is called.");
        return List.of(new User("guest"));
    }
}
class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
