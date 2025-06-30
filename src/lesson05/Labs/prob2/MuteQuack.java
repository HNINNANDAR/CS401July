package lesson05.Labs.prob2;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Cannot quack");
    }
}
